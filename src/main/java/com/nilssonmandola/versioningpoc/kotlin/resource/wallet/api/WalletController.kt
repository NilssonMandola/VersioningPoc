package com.nilssonmandola.versioningpoc.kotlin.resource.wallet.api

import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.bitcoin.kotlin.BitcoinV1DTO
import com.nilssonmandola.versioningpoc.java.service.wallet.internal.client.model.BalanceResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@RequestMapping("/kotlin/wallet")
interface WalletController {

    @GetMapping("/balance/{address}")
    fun getAddressBalance(@PathVariable("address") address: String): BalanceResponse

    @GetMapping("/balance/{address}/formatted")
    fun getAddressBalanceFormatted(@PathVariable("address") address: String): BitcoinV1DTO

}