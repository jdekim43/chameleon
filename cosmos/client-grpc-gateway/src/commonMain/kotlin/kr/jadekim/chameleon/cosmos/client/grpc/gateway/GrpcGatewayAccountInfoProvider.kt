package kr.jadekim.chameleon.cosmos.client.grpc.gateway

import cosmos.auth.v1beta1.QueryAccountInfoRequest
import cosmos.auth.v1beta1.QueryAccountRequest
import io.ktor.client.plugins.*
import io.ktor.http.*
import kr.jadekim.chameleon.cosmos.tool.AccountInfo
import kr.jadekim.chameleon.cosmos.tool.AccountInfoProvider

class GrpcGatewayAccountInfoProvider(client: CosmosGrpcGatewayClient) : AccountInfoProvider {

    private val service = client.service(cosmos.auth.v1beta1.grpc.gateway.QueryGrpcGateway)

    override suspend fun get(walletAddress: String): AccountInfo? {
        val account = try {
            service.account(QueryAccountRequest(walletAddress)).account
        } catch (e: ClientRequestException) {
            if (e.response.status == HttpStatusCode.NotFound) {
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