package com.Interceptor;
import java.util.ArrayList;

// Like Ciara's circle example, we use array list (rather than Vector) to register interceptors into.
// Here we use log rather than onEnd as the callback to be performed.

public class Dispatcher{

    private ArrayList<Interceptor> interceptorList;

    public Dispatcher(ArrayList<Interceptor> interceptorList) {
        this.interceptorList = interceptorList;
    }

    public Dispatcher() {
        this.interceptorList = new ArrayList<>();
    }

    public void registerInterceptor(Interceptor interceptor){
        interceptorList.add(interceptor);
    }

    public void removeInterceptor(Interceptor interceptor){
        interceptorList.remove(interceptor);
    }

    //dispatcher iterates through registered interceptors and
    //performs the event callback
    public void dispatchPaymentLogger(PaymentEventContextObject contextObject){
        for (Interceptor i : interceptorList) {
            i.log(contextObject);
        }
    }
}