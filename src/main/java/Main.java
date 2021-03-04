import com.Factory.ChicagoPizzaStore;
//import com.Factory.NYPizzaStore;
import com.Factory.PizzaStore;



public class Main {

    public static void main(String[] args){

        //setting up the new york and chicago stores
     // PizzaStore nyPizzaStore = new NYPizzaStore();
      PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();

      //ordering cheese pizza from ny store
     // nyPizzaStore.orderPizza("cheese");

      //ordering pepperoni pizza from chicago store
        chicagoPizzaStore.orderPizza("cheese");





    }
}


