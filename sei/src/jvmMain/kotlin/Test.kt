import com.google.protobuf.TypeRegistry
import com.google.protobuf.util.JsonFormat
import cosmos.bank.v1beta1.MsgSend
import cosmos.bank.v1beta1.Tx
import cosmos.bank.v1beta1.toAny
import cosmos.base.v1beta1.Coin
import cosmos.tx.v1beta1.TxJvmConverter.toDelegator
import google.protobuf.AnyJvmConverter.toDelegator
import kr.jadekim.chameleon.sei.SeiTransactionBuilder

fun main() {
    val msg = MsgSend("from", "to", listOf(Coin("denom", "0"))).toAny()
    val tx = SeiTransactionBuilder()
        .message(msg)
        .build()

    val printer = JsonFormat.printer()
        .usingTypeRegistry(
            TypeRegistry.newBuilder()
                .add(Tx.MsgSend.getDescriptor())
                .build()
        )
    println(printer.print(tx.toDelegator()))
}