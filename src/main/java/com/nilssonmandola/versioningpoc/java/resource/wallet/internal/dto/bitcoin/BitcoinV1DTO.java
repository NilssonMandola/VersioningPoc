package com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.bitcoin;

import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.amount.AmountDTO;
import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.bitcoin.kotlin.BitcoinDTO;

public class BitcoinV1DTO implements BitcoinDTO {

    public final String holderName;
    public final boolean displayBalance;
    public final String name;
    public final String number;
    public final String numberFormatted;
    public final AmountDTO balance;

    public BitcoinV1DTO(String holderName, boolean displayBalance, String name, String number, String numberFormatted, AmountDTO balance) {
        this.holderName = holderName;
        this.displayBalance = displayBalance;
        this.name = name;
        this.number = number;
        this.numberFormatted = numberFormatted;
        this.balance = balance;
    }
}
