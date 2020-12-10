package com.nilssonmandola.versioningpoc.java.resource.wallet.api;

import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.bitcoin.kotlin.BitcoinDTO;
import com.nilssonmandola.versioningpoc.java.service.wallet.internal.model.BitcoinBalance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/java/wallet")
public interface WalletController {

    @GetMapping("/balance/{address}")
    BitcoinBalance getAddressBalance(@PathVariable("address") String address);

    @GetMapping("/balance/{address}/formatted")
    BitcoinDTO getAddressBalanceFormatted(@PathVariable("address") String address,
                                          @RequestHeader("X-SHB-APP-VERSION") String apiVersion);


}
