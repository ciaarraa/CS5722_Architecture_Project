package com.Interceptor;
import java.util.ArrayList;

// Used array list (rather than Vector + clone) to register interceptors into.

public class Dispatcher{

    private ArrayList<Interceptor> interceptorList;

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