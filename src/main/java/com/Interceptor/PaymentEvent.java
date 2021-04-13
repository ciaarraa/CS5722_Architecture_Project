package com.Interceptor;
import com.PaymentAdapters.TransactionCurrency;
import com.PaymentAdapters.TransactionType;
// This is the "observer"
// We only have getters, no setters.
public interface PaymentEvent {
    public Double getAmount();
    public TransactionCurrency getTransactionCurrency();
    public TransactionType getTransactionType();
    public Long getTransactionTimestamp();
}
