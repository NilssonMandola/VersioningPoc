package com.nilssonmandola.versioningpoc.java.service.wallet.api;


import com.nilssonmandola.versioningpoc.java.service.wallet.internal.model.Address;
import com.nilssonmandola.versioningpoc.java.service.wallet.internal.model.BitcoinBalance;
import org.springframework.stereotype.Service;

@Service
public interface WalletService {

    BitcoinBalance getBalance(Address address);

}

