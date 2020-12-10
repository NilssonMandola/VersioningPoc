package com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.bitcoin.kotlin

import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.amount.AmountDTO

class BitcoinV3DTO(val ownerName: String,
                   val walletName: String,
                   val number: String,
                   val balance: AmountDTO) : BitcoinDTO