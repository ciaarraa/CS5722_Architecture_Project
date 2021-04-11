package com.Interceptor;
import com.PaymentAdapters.TransactionCurrency;
import com.PaymentAdapters.TransactionType;
// This is our version of the "Observer" in the circle example.
// We only have getters, no setters. The circle example just had one setter
public interface PaymentEvent {
    public Double getAmount();
    public TransactionCurrency getTransactionCurrency();
    public TransactionType getTransactionType();
    public Long getTransactionTimestamp();
}
