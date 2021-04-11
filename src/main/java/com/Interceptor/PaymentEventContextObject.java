package com.Interceptor;
import com.PaymentAdapters.CardPaymentInterface;
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
    //private CardPaymentInterface card;

    public PaymentEventContextObject(MasterCard masterCard){
        this.masterCard = masterCard;
        this.amount = masterCard.getAmount();
        this.transactionCurrency = masterCard.getCurrency();
        this.transactionType = masterCard.getTransactionType();
        this.transactionTimestamp = this.getTimestamp();
    }
    @Override
    public Long getTimestamp() {
        Instant instant = Instant.now();
        long timeStampMillis = instant.toEpochMilli();
        return timeStampMillis;
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
    public Long getTransactionTimestamp() { return transactionTimestamp; }
}
