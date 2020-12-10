package com.nilssonmandola.versioningpoc.java.resource.wallet.internal;

import com.nilssonmandola.versioningpoc.java.resource.common.ApiVersionResolver;
import com.nilssonmandola.versioningpoc.java.resource.wallet.api.WalletController;
import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.converter.bitcoin.BitcoinDTOConverterResolver;
import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.bitcoin.kotlin.BitcoinDTO;
import com.nilssonmandola.versioningpoc.java.service.wallet.internal.WalletServiceImpl;
import com.nilssonmandola.versioningpoc.java.service.wallet.internal.model.Address;
import com.nilssonmandola.versioningpoc.java.service.wallet.internal.model.BitcoinBalance;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WalletControllerImpl implements WalletController {

    private final WalletServiceImpl walletServiceImpl;
    private final BitcoinDTOConverterResolver bitcoinDTOConverterResolver;
    private final ApiVersionResolver apiVersionResolver;

    public WalletControllerImpl(WalletServiceImpl walletServiceImpl,
                                BitcoinDTOConverterResolver bitcoinDTOConverterResolver,
                                ApiVersionResolver apiVersionResolver) {
        this.walletServiceImpl = walletServiceImpl;
        this.bitcoinDTOConverterResolver = bitcoinDTOConverterResolver;
        this.apiVersionResolver = apiVersionResolver;
    }

    public BitcoinBalance getAddressBalance(String address) {
        return walletServiceImpl.getBalance(new Address(address));
    }

    public BitcoinDTO getAddressBalanceFormatted(String address, String apiVersion) {
        apiVersionResolver.setApiVersion(apiVersion);
        BitcoinBalance bitcoinBalance = walletServiceImpl.getBalance(new Address(address));
        return bitcoinDTOConverterResolver.convert(bitcoinBalance);
    }

}
