package com.Interceptor;
import com.PaymentAdapters.MasterCard;
import com.PaymentAdapters.TransactionCurrency;
import com.PaymentAdapters.TransactionType;
import java.time.Instant;

// Equivalent to Ciara's CircleContextObject
// Something is missing here, we need to link to the (concrete?) interceptor
// Don't have time to fix now!

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
        long timeStampMillis = instant.toEpochMilli();
        return timeStampMillis;
    }
}
