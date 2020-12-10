package com.nilssonmandola.versioningpoc.java.service.wallet.internal.client;

import com.nilssonmandola.versioningpoc.java.service.wallet.internal.client.model.BalanceResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Component
public
class WalletClient {

    private final RestTemplate restTemplate;

    WalletClient() {
        restTemplate = new RestTemplate();
    }

    public BalanceResponse getAddressBalance(String address) {
        URI uri = URI.create("https://blockchain.info/rawaddr/" + address);
        try {
            return restTemplate.getForEntity(uri, BalanceResponse.class).getBody();
        } catch (HttpClientErrorException e) {
            //Too many requests to blockchain.info, fallback to a mocked response
            return new BalanceResponse("1BoatSLRHtKNngkdXEeobR76b53LETtpyT",
                    "1BoatSLRHtKNngkdXEeobR76b53LETtpyT",
                    "2",
                    "2.21",
                    "1.21",
                    "1.00");
        }
    }

}
