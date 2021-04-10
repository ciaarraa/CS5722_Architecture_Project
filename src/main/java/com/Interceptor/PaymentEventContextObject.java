package com.Interceptor;
import java.time.Instant;

public class PaymentEventContextObject implements PaymentEvent {
    @Override
    public Long getTimestamp() {
        Instant instant = Instant.now();
        long timeStampMillis = instant.toEpochMilli();
        return timeStampMillis;
    }

    @Override
    public Double getAmount() {
        return null;
    }

    @Override
    public String getTransactionType() {
        return null;
    }
}
