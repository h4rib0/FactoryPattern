package factory_method_pattern.pizza_store;

import factory_method_pattern.pizzas.Pizza;
import factory_method_pattern.pizzas.chicago.ChicagoStyleCheesePizza;
import factory_method_pattern.pizzas.chicago.ChicagoStyleClamPizza;
import factory_method_pattern.pizzas.chicago.ChicagoStylePepperoniPizza;
import factory_method_pattern.pizzas.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        } else return null;
    }
}
