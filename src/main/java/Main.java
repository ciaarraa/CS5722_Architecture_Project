/*import com.Factory.ChicagoPizzaStore;
import com.Factory.NYPizzaStore;
import com.Factory.PizzaStore;
import com.Pizza.PizzaComponent;
import com.state.Customer;
import com.state.Order;

import java.util.ArrayList;


public class Main {

    public static void main(String[] args){

        // setting up the new york and chicago stores
        PizzaStore nyPizzaStore = new NYPizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

        // ordering cheese pizza from ny store
        PizzaComponent nyPizza1 = nyPizzaStore.orderPizza("cheese");
        PizzaComponent nyPizza2 = nyPizzaStore.orderPizza("pepperoni");

        ArrayList<PizzaComponent> pizzas = new ArrayList<>();
        pizzas.add(nyPizza1);
        pizzas.add(nyPizza2);

        // ordering pepperoni pizza from chicago store
//        chicagoPizzaStore.orderPizza("veggie");
       // chicagoPizzaStore.orderPizza("clam");

        Customer aCustomer = new Customer();

        Order anOrder = new Order(aCustomer.get_customerLevel(), pizzas);

        anOrder.addNewPoints();
        aCustomer.statement();
    }
}

 */




