# Chameleon

[![License](https://img.shields.io/badge/License-Apache%202.0-blue.svg)](LICENSE)
[![Kotlin](https://img.shields.io/badge/Kotlin-2.3.0-blue.svg)](https://kotlinlang.org/)
[![Version](https://maven-badges.sml.io/maven-central/kr.jadekim/chameleon-core-wallet/badge.svg)](https://github.com/jdekim43/chameleon)

A Kotlin Multiplatform crypto wallet SDK that provides a unified abstraction layer for multiple blockchain networks.

## Overview

Chameleon solves the integration complexity of working with multiple blockchain SDKs by providing a consistent architecture across different blockchain networks. Instead of learning and maintaining separate SDKs for each blockchain, Chameleon offers a single, unified API.

### Key Features

- **Unified Wallet Management**: Create, import, and manage wallets across multiple blockchains with a consistent API
- **BIP39/BIP32 Support**: Full implementation of mnemonic generation and hierarchical deterministic (HD) wallet derivation
- **Message Signing & Verification**: Sign and verify messages using blockchain-specific cryptographic algorithms
- **Multi-Language Mnemonic Support**: Supports 8 languages for mnemonic phrases (English, Korean, Japanese, Chinese Simplified, Chinese Traditional, French, Spanish, Italian)
- **Transaction Building & Broadcasting**: Comprehensive tools for creating, signing, and broadcasting transactions
- **Multiple Client Protocols**: Support for both gRPC and REST/LCD APIs for Cosmos-based chains
- **Multiplatform**: The wallet module supports JVM, iOS (arm64, simulator), and JavaScript/Node.js is in development

## Predefined Blockchains
- Cosmos
- Terra
- Terra Classic
- Sei
- Injective
- Initia
- Inertia

## Architecture

Chameleon is organized into modular components:

```
chameleon/
├── core/              # Core wallet, crypto, and type abstractions
│   ├── crypto/        # Cryptographic primitives
│   ├── wallet/        # Wallet, key management, BIP39/BIP32
│   ├── tool/          # Transaction signer, broadcaster interfaces
│   └── type/          # Common blockchain types
├── cosmos/            # Cosmos SDK implementation
│   ├── wallet/        # Cosmos wallet implementation
│   ├── type/          # Cosmos-specific types
│   ├── tool/          # Transaction tools
│   ├── client-grpc/   # gRPC client
│   └── client-grpc-gateway/  # REST/LCD client
├── terra/             # Terra-specific implementations
├── sei/               # Sei-specific implementations
├── injective/         # Injective-specific implementations
└── initia/            # Initia-specific implementations
```

## Installation

### Gradle (Kotlin)

Add the following to your `build.gradle.kts`:

```kotlin
repositories {
    mavenCentral()
}

dependencies {
    // Core wallet functionality
    implementation("kr.jadekim:chameleon-core-wallet:0.6.0-beta2")

    // For Cosmos blockchain
    implementation("kr.jadekim:chameleon-cosmos-wallet:0.6.0-beta2")
    implementation("kr.jadekim:chameleon-cosmos-tool:0.6.0-beta2")

    // For Terra blockchain
    implementation("kr.jadekim:chameleon-terra-wallet:0.6.0-beta2")

    // Add other blockchain modules as needed
}
```

### Maven

```xml
<dependency>
    <groupId>kr.jadekim</groupId>
    <artifactId>chameleon-core-wallet</artifactId>
    <version>0.6.0-beta2</version>
</dependency>
```

## Usage (e.g. Cosmos)

### Creating a Wallet

#### Generate a New Wallet

```kotlin
import kr.jadekim.chameleon.cosmos.wallet.CosmosWallet
import kr.jadekim.chameleon.core.mnemonic.Mnemonic

// Generate a new 24-word mnemonic and create a wallet
val (wallet, key) = CosmosWallet.create(
    mnemonic = Mnemonic.generate(Mnemonic.Strength.WORD_24),
    account = 0u,
    index = 0u
)

println("Address: ${wallet.address.text}")
println("Mnemonic: ${key.mnemonic}")
```

#### Import from Mnemonic

```kotlin
val (wallet, key) = CosmosWallet.fromMnemonic(
    mnemonic = "your twelve or twenty four word mnemonic phrase here...",
    account = 0u,
    index = 0u
)
```

#### Import from Private Key

```kotlin
val privateKeyBytes = hexStringToByteArray("your_private_key_hex")
val wallet = CosmosWallet.fromKeyPair(privateKeyBytes)
```

### Signing

```kotlin
// Sign a message
val message = "Hello, Blockchain!".encodeToByteArray()
val signature = wallet.sign(message).await()

// Verify a signature
val isValid = wallet.verify(message, signature)
println("Signature valid: $isValid")
```

### Make Transactions

```kotlin
import kr.jadekim.chameleon.cosmos.Cosmos
import kr.jadekim.chameleon.cosmos.CosmosOptions
import cosmos.tx.v1beta1.Tx
import cosmos.tx.v1beta1.TxBody
import cosmos.base.v1beta1.Coin

// Create client
val options = CosmosOptions(
    chainId = "cosmoshub-4",
    client = CosmosGrpcClient("[grpc host]"),
)
val cosmos = Cosmos(options)

// Build transaction
val tx = Tx(
    body = TxBody(
        messages = listOf(/* your messages */),
        memo = "Sent via Chameleon"
    ),
    authInfo = AuthInfo(/* fee and signer info */)
)

// Sign and Broadcast transaction
val transactionResult = cosmos.broadcast(tx, wallet)
```

### Multi-Language Mnemonic Support

```kotlin
import kr.jadekim.chameleon.core.mnemonic.Mnemonic
import kr.jadekim.chameleon.core.mnemonic.wordlist.Wordlist

// Generate mnemonic (default language is English)
val mnemonic = Mnemonic.generate(strength = Mnemonic.Strength.WORD_12)

// Generate Korean mnemonic
val koreanMnemonic = Mnemonic.generate(
    strength = Mnemonic.Strength.WORD_12,
    wordlist = Wordlist.KOREAN
)

// Generate Japanese mnemonic
val japaneseMnemonic = Mnemonic.generate(
    strength = Mnemonic.Strength.WORD_24,
    wordlist = Wordlist.JAPANESE
)
```

## Platform Support

- **JVM**: Full support (Java 11+)
- **iOS**: arm64, simulator arm64
- **JavaScript/Node.js**: In development

## Building from Source

### Requirements

- JDK 11 or higher
- Kotlin 2.3.0+
- Gradle 8.11+

### Build

```bash
# Clone the repository
git clone https://github.com/jdekim43/chameleon.git
cd chameleon

# Build all modules
./gradlew build

# Run tests
./gradlew test

# Publish to local Maven repository
./gradlew publishToMavenLocal
```

## Contributing

Contributions are welcome! Please feel free to submit a Pull Request.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the Apache License 2.0 - see the [LICENSE](LICENSE) file for details.
