package com.nilssonmandola.versioningpoc.java.resource.wallet.internal.converter.bitcoin;

import com.nilssonmandola.versioningpoc.java.service.wallet.internal.model.BitcoinBalance;
import org.springframework.core.convert.converter.Converter;

public interface BitcoinDTOConverter<T> extends Converter<BitcoinBalance, T> {
}
