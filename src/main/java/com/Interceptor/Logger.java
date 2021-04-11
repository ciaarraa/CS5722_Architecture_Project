package com.Interceptor;
import java.time.Instant;

public class Logger implements Interceptor {

    @Override
    public void log(PaymentEventContextObject contextObject) {
//        Instant instant = Instant.now();
//        long timeStampMillis = instant.toEpochMilli();
//        System.out.printf("%d  : blah\n", timeStampMillis);
        System.out.printf("%d: %s: %s: %f\n",
                contextObject.getTimestamp(),
                contextObject.getTransactionType().name(),
                contextObject.getTransactionCurrency().name(),
                contextObject.getAmount()
        );


    }
}
