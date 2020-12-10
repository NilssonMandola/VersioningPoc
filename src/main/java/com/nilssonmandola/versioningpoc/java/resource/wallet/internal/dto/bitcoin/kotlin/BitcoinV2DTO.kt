package com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.bitcoin.kotlin

import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.amount.AmountDTO

class BitcoinV2DTO(val ownerName: String,
                   val walletName: String,
                   val number: String,
                   val balans: AmountDTO) : BitcoinDTO