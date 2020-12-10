package com.nilssonmandola.versioningpoc.kotlin.resource.wallet.internal

import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.bitcoin.kotlin.BitcoinV1DTO
import com.nilssonmandola.versioningpoc.java.service.wallet.internal.client.model.BalanceResponse
import com.nilssonmandola.versioningpoc.kotlin.resource.wallet.api.WalletController
import org.springframework.web.bind.annotation.RestController

@RestController
class WalletControllerImplKT : WalletController {

    override fun getAddressBalance(address: String): BalanceResponse {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getAddressBalanceFormatted(address: String): BitcoinV1DTO {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}