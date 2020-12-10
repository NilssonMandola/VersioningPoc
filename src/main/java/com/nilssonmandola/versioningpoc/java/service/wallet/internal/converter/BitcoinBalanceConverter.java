package com.nilssonmandola.versioningpoc.java.service.wallet.internal.converter;

import com.nilssonmandola.versioningpoc.java.service.wallet.internal.client.model.BalanceResponse;
import com.nilssonmandola.versioningpoc.java.service.wallet.internal.model.BitcoinBalance;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class BitcoinBalanceConverter implements Converter<BalanceResponse, BitcoinBalance> {

    @Override
    public BitcoinBalance convert(BalanceResponse balanceResponse) {
        return new BitcoinBalance(
                balanceResponse.hash160,
                balanceResponse.address,
                balanceResponse.nTx,
                balanceResponse.totalReceived,
                balanceResponse.totalSent,
                balanceResponse.finalBalance);
    }
}
