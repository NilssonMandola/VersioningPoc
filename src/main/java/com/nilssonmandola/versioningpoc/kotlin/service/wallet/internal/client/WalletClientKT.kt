package com.nilssonmandola.versioningpoc.kotlin.service.wallet.internal.client

import com.nilssonmandola.versioningpoc.kotlin.service.wallet.internal.client.model.BalanceResponse
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate
import java.net.URI

@Component
class WalletClientKT {

    private val restTemplate: RestTemplate = RestTemplate()

    fun getAddressBalance(address: String): BalanceResponse? {
        val uri = URI.create("https://blockchain.info/q/addressbalance/$address")
        return restTemplate.getForEntity(uri, BalanceResponse::class.java).body
    }

}
