package com.nilssonmandola.versioningpoc.java.service.wallet.internal.client.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

/*
{
    "hash160": "ed7a21733c02aaf746532feb4fe2bcb402a2676b",
    "address": "1NefTFZsYa5BtT3L1sBy3Kgadmjp2CT6hh",
    "n_tx": 0,
    "total_received": 0,
    "total_sent": 0,
    "final_balance": 0,
    "txs": []
}
 */
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class BalanceResponse {

    public final String hash160;
    public final String address;
    public final String nTx;
    public final String totalReceived;
    public final String totalSent;
    public final String finalBalance;

    public BalanceResponse(){
        this(null, null, null, null, null, null);
    }

    public BalanceResponse(String hash160, String address, String nTx, String totalReceived, String totalSent, String finalBalance) {
        this.hash160 = hash160;
        this.address = address;
        this.nTx = nTx;
        this.totalReceived = totalReceived;
        this.totalSent = totalSent;
        this.finalBalance = finalBalance;
    }
}
