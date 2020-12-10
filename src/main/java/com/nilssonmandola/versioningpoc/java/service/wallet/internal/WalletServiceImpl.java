package com.nilssonmandola.versioningpoc.java.service.wallet.internal;

import com.nilssonmandola.versioningpoc.java.service.wallet.api.WalletService;
import com.nilssonmandola.versioningpoc.java.service.wallet.internal.client.WalletClient;
import com.nilssonmandola.versioningpoc.java.service.wallet.internal.client.model.BalanceResponse;
import com.nilssonmandola.versioningpoc.java.service.wallet.internal.converter.BitcoinBalanceConverter;
import com.nilssonmandola.versioningpoc.java.service.wallet.internal.model.Address;
import com.nilssonmandola.versioningpoc.java.service.wallet.internal.model.BitcoinBalance;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService {

    private final WalletClient walletClient;
    private final BitcoinBalanceConverter bitcoinBalanceConverter;

    WalletServiceImpl(WalletClient walletClient,
                      BitcoinBalanceConverter bitcoinBalanceConverter){
        this.walletClient = walletClient;
        this.bitcoinBalanceConverter = bitcoinBalanceConverter;
    }

    public BitcoinBalance getBalance(Address address) {
        BalanceResponse balanceResponse = walletClient.getAddressBalance(address.address);
        return bitcoinBalanceConverter.convert(balanceResponse);
    }

}
