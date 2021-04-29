package com.Decorator;
import java.math.BigDecimal;
public interface Discount {

            BigDecimal apply(BigDecimal originalPrice);

    }
