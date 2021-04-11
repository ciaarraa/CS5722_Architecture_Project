package com.Interceptor;
// This our concreteInterceptor,
// except that we are reading values from the framework via the context object and logging them
// rather than 'writing' back into the framework via the context object as in the circle example

public class Logger implements Interceptor {

    @Override
    public void log(PaymentEventContextObject contextObject) {
        // TODO: I'd like to output this to a file maybe
        System.out.printf("%d: %s: %s: %f\n",
                contextObject.getTransactionTimestamp(),
                contextObject.getTransactionType().name(),
                contextObject.getTransactionCurrency().name(),
                contextObject.getAmount()
        );


    }
}
