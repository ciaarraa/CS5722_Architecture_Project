package com.Interceptor;
import java.time.Instant;

public class Logger implements Interceptor {

    @Override
    public void log(PaymentEvent context) {
        Instant instant = Instant.now();
        long timeStampMillis = instant.toEpochMilli();
        System.out.printf("%d  : blah\n", timeStampMillis);


    }
}
