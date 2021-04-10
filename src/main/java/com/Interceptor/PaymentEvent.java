package com.Interceptor;

public interface PaymentEvent {
    public Long getTimestamp();
    public Double getAmount();
    public String getTransactionType();
}
