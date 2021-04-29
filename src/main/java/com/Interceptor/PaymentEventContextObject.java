package com.Interceptor;
import com.PaymentAdapters.MasterCard;
import com.PaymentAdapters.TransactionCurrency;
import com.PaymentAdapters.TransactionType;
import java.time.Instant;

public class PaymentEventContextObject implements PaymentEvent {
    private MasterCard masterCard;
    private double amount;
    private TransactionCurrency transactionCurrency;
    private TransactionType transactionType;
    private Long transactionTimestamp;


    public PaymentEventContextObject(MasterCard masterCard){
        this.masterCard = masterCard;
        this.amount = masterCard.getAmount();
        this.transactionCurrency = masterCard.getCurrency();
        this.transactionType = masterCard.getTransactionType();
        this.transactionTimestamp = this.getTransactionTimestamp();
    }

    @Override
    public Double getAmount() {
        return amount;
    }

    @Override
    public TransactionType getTransactionType() {
        return transactionType;
    }

    @Override
    public TransactionCurrency getTransactionCurrency() {
        return transactionCurrency;
    }

    @Override
    public Long getTransactionTimestamp() {
        Instant instant = Instant.now();
        return instant.toEpochMilli();
    }
}
