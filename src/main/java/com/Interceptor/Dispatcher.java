package com.Interceptor;
import java.util.Vector;

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

public class Dispatcher {
    Vector interceptors_;
    synchronized public void registerLogger (Logger i){
        interceptors_.addElement(i);
    }
    synchronized public void removeLogger (Logger i){
        interceptors_.removeElement(i);
    }

    public void dispatchPaymentLogger (PaymentEvent context) {
        Vector interceptors;
        synchronized (this) {
            interceptors = (Vector)interceptors.clone();
        }
        for(int i=0; i < interceptors.size(); i++) {
            Interceptor intercept = (Interceptor)interceptors.elementAt(i);
            intercept.onPaymentEvent(context);
        }

    }

}
