package com.nilssonmandola.versioningpoc.java.resource.wallet.internal.converter.bitcoin;

import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.amount.AmountDTO;
import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.bitcoin.kotlin.BitcoinV3DTO;
import com.nilssonmandola.versioningpoc.java.service.wallet.internal.model.BitcoinBalance;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BitcoinV3DTOConverter implements BitcoinDTOConverter<BitcoinV3DTO> {

    @Override
    public BitcoinV3DTO convert(BitcoinBalance bitcoinBalance) {
        AmountDTO amountDTO = new AmountDTO(
                new BigDecimal(bitcoinBalance.finalBalance),
                bitcoinBalance.finalBalance,
                bitcoinBalance.unit,
                bitcoinBalance.currency);
        return new BitcoinV3DTO(bitcoinBalance.address,
                bitcoinBalance.address,
                bitcoinBalance.address,
                amountDTO);
    }
}