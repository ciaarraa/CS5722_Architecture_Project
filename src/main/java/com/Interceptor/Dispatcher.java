package com.Interceptor;
import java.util.Vector;
import java.util.ArrayList;

//public class Dispatcher {
//    public void dispatchPaymentLogger (PaymentEvent context) {
//        Vector interceptors;
//        synchronized (this) {
//            interceptors = (Vector) interceptors.clone();
//        }
//        for(int i=0; i < interceptors.size(); i++) {
//            Interceptor intercept = (Interceptor)interceptors.elementAt(i);
//            intercept.onPaymentEvent(context);
//        }
//
//    }
//}

//public class Dispatcher {
//    Vector interceptors_;
//    synchronized public void registerLogger (Logger i){
//        interceptors_.addElement(i);
//    }
//    synchronized public void removeLogger (Logger i){
//        interceptors_.removeElement(i);
//    }
//
//    public void dispatchPaymentLogger (PaymentEvent context) {
//        Vector interceptors;
//        synchronized (this) {
//            interceptors = (Vector)interceptors.clone();
//        }
//        for(int i=0; i < interceptors.size(); i++) {
//            Interceptor intercept = (Interceptor)interceptors.elementAt(i);
//            //intercept.onPaymentEvent(context);
//            intercept.log(context);
//        }
//
//    }

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