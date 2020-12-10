package com.nilssonmandola.versioningpoc.java.resource.wallet.internal.converter.bitcoin;

import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.amount.AmountDTO;
import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.bitcoin.kotlin.BitcoinV2DTO;
import com.nilssonmandola.versioningpoc.java.service.wallet.internal.model.BitcoinBalance;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BitcoinV2DTOConverter implements BitcoinDTOConverter<BitcoinV2DTO> {

    @Override
    public BitcoinV2DTO convert(BitcoinBalance bitcoinBalance) {
        AmountDTO amountDTO = new AmountDTO(
                new BigDecimal(bitcoinBalance.finalBalance),
                bitcoinBalance.finalBalance,
                bitcoinBalance.unit,
                bitcoinBalance.currency);
        return new BitcoinV2DTO(bitcoinBalance.address,
                bitcoinBalance.address,
                bitcoinBalance.address,
                amountDTO);
    }
}
