package kr.jadekim.chameleon.core.hd

object Slip10TestData {

    data class Item(
        val seed: String,
        val keys: List<Key>,
    )

    data class Key(
        val path: String,
        val fingerprint: String,
        val chainCode: String,
        val publicKey: String,
        val privateKey: String,
    )

    val secp256k1 = listOf(
        Item(
            seed = "000102030405060708090a0b0c0d0e0f",
            keys = listOf(
                Key(
                    path = "m",
                    fingerprint = "00000000",
                    chainCode = "873dff81c02f525623fd1fe5167eac3a55a049de3d314bb42ee227ffed37d508",
                    privateKey = "e8f32e723decf4051aefac8e2c93c9c5b214313817cdb01a1494b917c8436b35",
                    publicKey = "0339a36013301597daef41fbe593a02cc513d0b55527ec2df1050e2e8ff49c85c2",
                ),
                Key(
                    path = "m/0'",
                    fingerprint = "3442193e",
                    chainCode = "47fdacbd0f1097043b78c63c20c34ef4ed9a111d980047ad16282c7ae6236141",
                    privateKey = "edb2e14f9ee77d26dd93b4ecede8d16ed408ce149b6cd80b0715a2d911a0afea",
                    publicKey = "035a784662a4a20a65bf6aab9ae98a6c068a81c52e4b032c0fb5400c706cfccc56",
                ),
                Key(
                    path = "m/0'/1",
                    fingerprint = "5c1bd648",
                    chainCode = "2a7857631386ba23dacac34180dd1983734e444fdbf774041578e9b6adb37c19",
                    privateKey = "3c6cb8d0f6a264c91ea8b5030fadaa8e538b020f0a387421a12de9319dc93368",
                    publicKey = "03501e454bf00751f24b1b489aa925215d66af2234e3891c3b21a52bedb3cd711c",
                ),
                Key(
                    path = "m/0'/1/2'",
                    fingerprint = "bef5a2f9",
                    chainCode = "04466b9cc8e161e966409ca52986c584f07e9dc81f735db683c3ff6ec7b1503f",
                    privateKey = "cbce0d719ecf7431d88e6a89fa1483e02e35092af60c042b1df2ff59fa424dca",
                    publicKey = "0357bfe1e341d01c69fe5654309956cbea516822fba8a601743a012a7896ee8dc2",
                ),
                Key(
                    path = "m/0'/1/2'/2",
                    fingerprint = "ee7ab90c",
                    chainCode = "cfb71883f01676f587d023cc53a35bc7f88f724b1f8c2892ac1275ac822a3edd",
                    privateKey = "0f479245fb19a38a1954c5c7c0ebab2f9bdfd96a17563ef28a6a4b1a2a764ef4",
                    publicKey = "02e8445082a72f29b75ca48748a914df60622a609cacfce8ed0e35804560741d29",
                ),
                Key(
                    path = "m/0'/1/2'/2/1000000000",
                    fingerprint = "d880d7d8",
                    chainCode = "c783e67b921d2beb8f6b389cc646d7263b4145701dadd2161548a8b078e65e9e",
                    privateKey = "471b76e389e528d6de6d816857e012c5455051cad6660850e58372a6c3e6e7c8",
                    publicKey = "022a471424da5e657499d1ff51cb43c47481a03b1e77f951fe64cec9f5a48f7011",
                ),
            ),
        ),
        Item(
            seed = "fffcf9f6f3f0edeae7e4e1dedbd8d5d2cfccc9c6c3c0bdbab7b4b1aeaba8a5a29f9c999693908d8a8784817e7b7875726f6c696663605d5a5754514e4b484542",
            keys = listOf(
                Key(
                    path = "m",
                    fingerprint = "00000000",
                    chainCode = "60499f801b896d83179a4374aeb7822aaeaceaa0db1f85ee3e904c4defbd9689",
                    privateKey = "4b03d6fc340455b363f51020ad3ecca4f0850280cf436c70c727923f6db46c3e",
                    publicKey = "03cbcaa9c98c877a26977d00825c956a238e8dddfbd322cce4f74b0b5bd6ace4a7",
                ),
                Key(
                    path = "m/0",
                    fingerprint = "bd16bee5",
                    chainCode = "f0909affaa7ee7abe5dd4e100598d4dc53cd709d5a5c2cac40e7412f232f7c9c",
                    privateKey = "abe74a98f6c7eabee0428f53798f0ab8aa1bd37873999041703c742f15ac7e1e",
                    publicKey = "02fc9e5af0ac8d9b3cecfe2a888e2117ba3d089d8585886c9c826b6b22a98d12ea",
                ),
                Key(
                    path = "m/0/2147483647'",
                    fingerprint = "5a61ff8e",
                    chainCode = "be17a268474a6bb9c61e1d720cf6215e2a88c5406c4aee7b38547f585c9a37d9",
                    privateKey = "877c779ad9687164e9c2f4f0f4ff0340814392330693ce95a58fe18fd52e6e93",
                    publicKey = "03c01e7425647bdefa82b12d9bad5e3e6865bee0502694b94ca58b666abc0a5c3b",
                ),
                Key(
                    path = "m/0/2147483647'/1",
                    fingerprint = "d8ab4937",
                    chainCode = "f366f48f1ea9f2d1d3fe958c95ca84ea18e4c4ddb9366c336c927eb246fb38cb",
                    privateKey = "704addf544a06e5ee4bea37098463c23613da32020d604506da8c0518e1da4b7",
                    publicKey = "03a7d1d856deb74c508e05031f9895dab54626251b3806e16b4bd12e781a7df5b9",
                ),
                Key(
                    path = "m/0/2147483647'/1/2147483646'",
                    fingerprint = "78412e3a",
                    chainCode = "637807030d55d01f9a0cb3a7839515d796bd07706386a6eddf06cc29a65a0e29",
                    privateKey = "f1c7c871a54a804afe328b4c83a1c33b8e5ff48f5087273f04efa83b247d6a2d",
                    publicKey = "02d2b36900396c9282fa14628566582f206a5dd0bcc8d5e892611806cafb0301f0",
                ),
                Key(
                    path = "m/0/2147483647'/1/2147483646'/2",
                    fingerprint = "31a507b8",
                    chainCode = "9452b549be8cea3ecb7a84bec10dcfd94afe4d129ebfd3b3cb58eedf394ed271",
                    privateKey = "bb7d39bdb83ecf58f2fd82b6d918341cbef428661ef01ab97c28a4842125ac23",
                    publicKey = "024d902e1a2fc7a8755ab5b694c575fce742c48d9ff192e63df5193e4c7afe1f9c",
                ),
            ),
        ),
    )

    val secp256r1 = listOf(
        Item(
            seed = "000102030405060708090a0b0c0d0e0f",
            keys = listOf(
                Key(
                    path = "m",
                    fingerprint = "00000000",
                    chainCode = "beeb672fe4621673f722f38529c07392fecaa61015c80c34f29ce8b41b3cb6ea",
                    privateKey = "612091aaa12e22dd2abef664f8a01a82cae99ad7441b7ef8110424915c268bc2",
                    publicKey = "0266874dc6ade47b3ecd096745ca09bcd29638dd52c2c12117b11ed3e458cfa9e8",
                ),
                Key(
                    path = "m/0'",
                    fingerprint = "be6105b5",
                    chainCode = "3460cea53e6a6bb5fb391eeef3237ffd8724bf0a40e94943c98b83825342ee11",
                    privateKey = "6939694369114c67917a182c59ddb8cafc3004e63ca5d3b84403ba8613debc0c",
                    publicKey = "0384610f5ecffe8fda089363a41f56a5c7ffc1d81b59a612d0d649b2d22355590c",
                ),
                Key(
                    path = "m/0'/1",
                    fingerprint = "9b02312f",
                    chainCode = "4187afff1aafa8445010097fb99d23aee9f599450c7bd140b6826ac22ba21d0c",
                    privateKey = "284e9d38d07d21e4e281b645089a94f4cf5a5a81369acf151a1c3a57f18b2129",
                    publicKey = "03526c63f8d0b4bbbf9c80df553fe66742df4676b241dabefdef67733e070f6844",
                ),
                Key(
                    path = "m/0'/1/2'",
                    fingerprint = "b98005c1",
                    chainCode = "98c7514f562e64e74170cc3cf304ee1ce54d6b6da4f880f313e8204c2a185318",
                    privateKey = "694596e8a54f252c960eb771a3c41e7e32496d03b954aeb90f61635b8e092aa7",
                    publicKey = "0359cf160040778a4b14c5f4d7b76e327ccc8c4a6086dd9451b7482b5a4972dda0",
                ),
                Key(
                    path = "m/0'/1/2'/2",
                    fingerprint = "0e9f3274",
                    chainCode = "ba96f776a5c3907d7fd48bde5620ee374d4acfd540378476019eab70790c63a0",
                    privateKey = "5996c37fd3dd2679039b23ed6f70b506c6b56b3cb5e424681fb0fa64caf82aaa",
                    publicKey = "029f871f4cb9e1c97f9f4de9ccd0d4a2f2a171110c61178f84430062230833ff20",
                ),
                Key(
                    path = "m/0'/1/2'/2/1000000000",
                    fingerprint = "8b2b5c4b",
                    chainCode = "b9b7b82d326bb9cb5b5b121066feea4eb93d5241103c9e7a18aad40f1dde8059",
                    privateKey = "21c4f269ef0a5fd1badf47eeacebeeaa3de22eb8e5b0adcd0f27dd99d34d0119",
                    publicKey = "02216cd26d31147f72427a453c443ed2cde8a1e53c9cc44e5ddf739725413fe3f4",
                ),
            ),
        ),
        Item(
            seed = "fffcf9f6f3f0edeae7e4e1dedbd8d5d2cfccc9c6c3c0bdbab7b4b1aeaba8a5a29f9c999693908d8a8784817e7b7875726f6c696663605d5a5754514e4b484542",
            keys = listOf(
                Key(
                    path = "m",
                    fingerprint = "00000000",
                    chainCode = "96cd4465a9644e31528eda3592aa35eb39a9527769ce1855beafc1b81055e75d",
                    privateKey = "eaa31c2e46ca2962227cf21d73a7ef0ce8b31c756897521eb6c7b39796633357",
                    publicKey = "02c9e16154474b3ed5b38218bb0463e008f89ee03e62d22fdcc8014beab25b48fa",
                ),
                Key(
                    path = "m/0",
                    fingerprint = "607f628f",
                    chainCode = "84e9c258bb8557a40e0d041115b376dd55eda99c0042ce29e81ebe4efed9b86a",
                    privateKey = "d7d065f63a62624888500cdb4f88b6d59c2927fee9e6d0cdff9cad555884df6e",
                    publicKey = "039b6df4bece7b6c81e2adfeea4bcf5c8c8a6e40ea7ffa3cf6e8494c61a1fc82cc",
                ),
                Key(
                    path = "m/0/2147483647'",
                    fingerprint = "946d2a54",
                    chainCode = "f235b2bc5c04606ca9c30027a84f353acf4e4683edbd11f635d0dcc1cd106ea6",
                    privateKey = "96d2ec9316746a75e7793684ed01e3d51194d81a42a3276858a5b7376d4b94b9",
                    publicKey = "02f89c5deb1cae4fedc9905f98ae6cbf6cbab120d8cb85d5bd9a91a72f4c068c76",
                ),
                Key(
                    path = "m/0/2147483647'/1",
                    fingerprint = "218182d8",
                    chainCode = "7c0b833106235e452eba79d2bdd58d4086e663bc8cc55e9773d2b5eeda313f3b",
                    privateKey = "974f9096ea6873a915910e82b29d7c338542ccde39d2064d1cc228f371542bbc",
                    publicKey = "03abe0ad54c97c1d654c1852dfdc32d6d3e487e75fa16f0fd6304b9ceae4220c64",
                ),
                Key(
                    path = "m/0/2147483647'/1/2147483646'",
                    fingerprint = "931223e4",
                    chainCode = "5794e616eadaf33413aa309318a26ee0fd5163b70466de7a4512fd4b1a5c9e6a",
                    privateKey = "da29649bbfaff095cd43819eda9a7be74236539a29094cd8336b07ed8d4eff63",
                    publicKey = "03cb8cb067d248691808cd6b5a5a06b48e34ebac4d965cba33e6dc46fe13d9b933",
                ),
                Key(
                    path = "m/0/2147483647'/1/2147483646'/2",
                    fingerprint = "956c4629",
                    chainCode = "3bfb29ee8ac4484f09db09c2079b520ea5616df7820f071a20320366fbe226a7",
                    privateKey = "bb0a77ba01cc31d77205d51d08bd313b979a71ef4de9b062f8958297e746bd67",
                    publicKey = "020ee02e18967237cf62672983b253ee62fa4dd431f8243bfeccdf39dbe181387f",
                ),
            ),
        ),
    )
    val nist256p1 = secp256r1
    val p256 = secp256r1
}