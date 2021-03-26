import com.Factory.ChicagoPizzaStore;
import com.Factory.NYPizzaStore;
import com.Factory.PizzaStore;
import com.Pizza.Pizza;
import com.Pizza.PizzaComposite;
import com.state.Customer;
import com.state.Order;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args){

        // setting up the new york and chicago stores
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        // ordering cheese pizza from ny store
        PizzaComposite nyPizza1 = nyPizzaStore.orderPizza("cheese");
        PizzaComposite nyPizza2 = nyPizzaStore.orderPizza("pepperoni");

        ArrayList<PizzaComposite> pizzas = new ArrayList<>();
        pizzas.add(nyPizza1);
        pizzas.add(nyPizza2);

        // ordering pepperoni pizza from chicago store
        //chicagoPizzaStore.orderPizza("veggie");
       // chicagoPizzaStore.orderPizza("clam");

      Customer aCustomer = new Customer();

       Order anOrder = new Order(aCustomer.get_customerLevel(), pizzas);

       anOrder.addNewPoints();
        aCustomer.statement();

   /*   Customer aCustomer = new Customer("Gold")
      Order anOrder=new Order (new Order, 3);
      aCustomer.addOrer(anOrder);
      String statement = aCcustomer.statement();*/

      /*  Customer customerTom = new Customer("GoldLevel");
        Rental rented=new Rental(newRelease, 3);
        customerTom.addRental(rented);
        String statement = customerTom.statement();*/
    }
}


