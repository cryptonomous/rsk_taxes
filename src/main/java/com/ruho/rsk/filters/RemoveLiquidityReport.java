package com.ruho.rsk.filters;

import java.math.BigDecimal;

public class RemoveLiquidityReport {
    private BigDecimal sovsRewards;

    private String transactionHash;

    private String quotedSymbol;            // usdt ?
    private BigDecimal quotedAmount;

    private String baseSymbol;              // btc ?
    private BigDecimal baseAmount;

    private BigDecimal fees;    //always in BTC

    public BigDecimal getSovsRewards() {
        return sovsRewards;
    }

    public RemoveLiquidityReport setSovsRewards(BigDecimal sovsRewards) {
        this.sovsRewards = sovsRewards;
        return this;
    }

    public String getTransactionHash() {
        return transactionHash;
    }

    public RemoveLiquidityReport setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
        return this;
    }

    public String getQuotedSymbol() {
        return quotedSymbol;
    }

    public RemoveLiquidityReport setQuotedSymbol(String quotedSymbol) {
        this.quotedSymbol = quotedSymbol;
        return this;
    }

    public BigDecimal getQuotedAmount() {
        return quotedAmount;
    }

    public RemoveLiquidityReport setQuotedAmount(BigDecimal quotedAmount) {
        this.quotedAmount = quotedAmount;
        return this;
    }

    public String getBaseSymbol() {
        return baseSymbol;
    }

    public RemoveLiquidityReport setBaseSymbol(String baseSymbol) {
        this.baseSymbol = baseSymbol;
        return this;
    }

    public BigDecimal getBaseAmount() {
        return baseAmount;
    }

    public RemoveLiquidityReport setBaseAmount(BigDecimal baseAmount) {
        this.baseAmount = baseAmount;
        return this;
    }

    public BigDecimal getFees() {
        return fees;
    }

    public RemoveLiquidityReport setFees(BigDecimal fees) {
        this.fees = fees;
        return this;
    }


    @Override
    public String toString() {
        return "RemoveLiquidityReport{" +
                "sovsRewards=" + sovsRewards +
                ", transactionHash='" + transactionHash + '\'' +
                ", quotedSymbol='" + quotedSymbol + '\'' +
                ", quotedAmount=" + quotedAmount +
                ", baseSymbol='" + baseSymbol + '\'' +
                ", baseAmount=" + baseAmount +
                ", fees=" + fees +
                '}';
    }
}