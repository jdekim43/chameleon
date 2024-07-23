package kr.jadekim.chameleon.cosmos.client.grpc

import cosmos.auth.v1beta1.QueryAccountInfoRequest
import cosmos.auth.v1beta1.QueryAccountRequest
import io.grpc.Status
import io.grpc.StatusException
import kr.jadekim.chameleon.cosmos.tool.AccountInfo
import kr.jadekim.chameleon.cosmos.tool.AccountInfoProvider

class GrpcAccountInfoProvider(client: CosmosGrpcClient) : AccountInfoProvider {

    private val service = client.service(cosmos.auth.v1beta1.grpc.QueryGrpc)

    override suspend fun get(walletAddress: String): AccountInfo? {
        val account = try {
            service.account(QueryAccountRequest(walletAddress)).account
        } catch (e: StatusException) {
            if (e.status == Status.NOT_FOUND) {
                return null
            }

            throw e
        }

        val baseAccount = when (account.typeUrl) {
            cosmos.auth.v1beta1.BaseAccount.TYPE_URL -> cosmos.auth.v1beta1.BaseAccountConverter.deserialize(account.value)
            cosmos.vesting.v1beta1.PeriodicVestingAccount.TYPE_URL -> cosmos.vesting.v1beta1.PeriodicVestingAccountConverter
                .deserialize(account.value).baseVestingAccount.baseAccount

            else -> service.accountInfo(QueryAccountInfoRequest(walletAddress)).info
        }

        return AccountInfo(
            baseAccount.address,
            baseAccount.accountNumber,
            baseAccount.sequence,
        )
    }

    override suspend fun increaseSequence(walletAddress: String) {
        //do nothing
    }

    override suspend fun refreshSequence(walletAddress: String) {
        //do nothing
    }
}
