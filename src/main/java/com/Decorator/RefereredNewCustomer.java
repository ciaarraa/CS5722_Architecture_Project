package com.Decorator;

import java.math.BigDecimal;

public class RefereredNewCustomer extends DiscountDecorator{


        public static final BigDecimal FIVE = new BigDecimal(5);

        public RefereredNewCustomer(Discount discount) {
            super(discount);
        }

        @Override
        public BigDecimal apply(BigDecimal originalPrice) {

            BigDecimal discountedPrice = super.apply(originalPrice);

            if(discountedPrice.compareTo(FIVE)<=0) {
                return discountedPrice;
            }

            return discountedPrice.subtract(FIVE);
        }
    }


