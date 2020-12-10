package com.nilssonmandola.versioningpoc.java.service.wallet.internal.model;

public class BitcoinBalance {

    public final String hash160;
    public final String address;
    public final String nTx;
    public final String totalReceived;
    public final String totalSent;
    public final String finalBalance;
    public final String unit;
    public final String currency;

    public BitcoinBalance(String hash160, String address, String nTx, String totalReceived, String totalSent, String finalBalance) {
        this.hash160 = hash160;
        this.address = address;
        this.nTx = nTx;
        this.totalReceived = totalReceived;
        this.totalSent = totalSent;
        this.finalBalance = finalBalance;
        this.unit = "btc";
        this.currency = "BTC";
    }

}
