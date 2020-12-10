package com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.bitcoin;

import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.amount.AmountDTO;
import com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.bitcoin.kotlin.BitcoinDTO;

public class BitcoinV3DTO implements BitcoinDTO {

    public final String ownerName;
    public final String walletName;
    public final String number;
    public final AmountDTO balance;

    public BitcoinV3DTO(String ownerName, String walletName, String number, AmountDTO balance) {
        this.ownerName = ownerName;
        this.walletName = walletName;
        this.number = number;
        this.balance = balance;
    }
}

