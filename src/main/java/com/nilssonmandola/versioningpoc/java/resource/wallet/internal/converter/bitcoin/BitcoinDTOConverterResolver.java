package com.nilssonmandola.versioningpoc.java.resource.wallet.internal.converter.bitcoin;

import com.nilssonmandola.versioningpoc.java.resource.common.ApiVersion;
import com.nilssonmandola.versioningpoc.java.resource.common.ApiVersionResolver;
import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.bitcoin.kotlin.BitcoinDTO;
import com.nilssonmandola.versioningpoc.java.service.wallet.internal.model.BitcoinBalance;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class BitcoinDTOConverterResolver implements Converter<BitcoinBalance, BitcoinDTO> {

    private final Map<ApiVersion, BitcoinDTOConverter<? extends BitcoinDTO>> converterMap;
    private final ApiVersionResolver apiVersionResolver;

    BitcoinDTOConverterResolver(BitcoinV1DTOConverter v1DTOConverter,
                                BitcoinV2DTOConverter v2DTOConverter,
                                BitcoinV3DTOConverter v3DTOConverter,
                                ApiVersionResolver apiVersionResolver) {
        this.apiVersionResolver = apiVersionResolver;
        converterMap = Map.of(
                ApiVersion.V_1_0, v1DTOConverter,
                ApiVersion.V_2_0, v2DTOConverter,
                ApiVersion.V_3_0, v3DTOConverter);
    }

    @Override
    public BitcoinDTO convert(BitcoinBalance bitcoinBalance) {
        return converterMap.get(apiVersionResolver.getApiVersion()).convert(bitcoinBalance);
    }
}
