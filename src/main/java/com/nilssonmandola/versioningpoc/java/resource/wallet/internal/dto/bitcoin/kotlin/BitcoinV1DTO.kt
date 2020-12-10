package com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.bitcoin.kotlin

import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.amount.AmountDTO

class BitcoinV1DTO(val holderName: String,
                   val displayBalance: Boolean,
                   val name: String,
                   val number: String,
                   val numberFormatted: String,
                   val balance: AmountDTO) : BitcoinDTO