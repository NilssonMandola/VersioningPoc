package com.nilssonmandola.versioningpoc.kotlin.service.wallet.internal.client.model

import com.fasterxml.jackson.databind.PropertyNamingStrategy.SnakeCaseStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming

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
@JsonNaming(SnakeCaseStrategy::class)
class BalanceResponse @JvmOverloads
    constructor(val hash160: String? = null,
                val address: String? = null,
                val nTx: String? = null,
                val totalReceived: String? = null,
                val totalSent: String? = null,
                val finalBalance: String? = null)