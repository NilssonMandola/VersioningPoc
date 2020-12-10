package com.nilssonmandola.versioningpoc.java.resource.wallet.internal.dto.amount;

import java.math.BigDecimal;

public class AmountDTO {

    public final BigDecimal amount;
    public final String amountFormatted;
    public final String unit;
    public final String currency;

    public AmountDTO(BigDecimal amount, String amountFormatted, String unit, String currency) {
        this.amount = amount;
        this.amountFormatted = amountFormatted;
        this.unit = unit;
        this.currency = currency;
    }
}
