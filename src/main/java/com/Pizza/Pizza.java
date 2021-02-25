package com.Pizza;

import java.util.ArrayList;

public abstract class Pizza {
   String name;
   String dough;
   String sauce;
   ArrayList<String> toppings = new ArrayList<>();

  public void prepare(){
       System.out.println("Preparing " + name);
       System.out.println("Tossing dough..");
       System.out.println("Adding sauce..");
       System.out.println("Adding toppings: ");
      for (Object topping : toppings) {
          System.out.println(" " + topping);
      }
   }


   public String getName(){
      return name;
   }

    public void bake(){
        System.out.println("Bake for 25 mins at 200 degrees");
    }


    public void cut(){
        System.out.println("Cutting the Pizza");
    }

    public  void box(){
        System.out.println("Placing pizza in box.");
    }

}
