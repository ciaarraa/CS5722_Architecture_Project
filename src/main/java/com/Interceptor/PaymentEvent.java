package com.Interceptor;

import com.PaymentAdapters.TransactionCurrency;
import com.PaymentAdapters.TransactionType;

public interface PaymentEvent {
    public Long getTimestamp();
    public Double getAmount();
    public TransactionCurrency getTransactionCurrency();
    public TransactionType getTransactionType();
    public Long getTransactionTimestamp();
}
