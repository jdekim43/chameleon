package kr.jadekim.chameleon.cosmos.tool.broadcaster

import cosmos.base.abci.v1beta1.TxResponse
import cosmos.tx.v1beta1.Tx
import kr.jadekim.chameleon.core.tool.broadcaster.Broadcaster

typealias CosmosBroadcaster = Broadcaster<Tx, TxResponse>
