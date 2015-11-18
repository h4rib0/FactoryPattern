package factory_method_pattern.pizza_store;

import factory_method_pattern.pizzas.Pizza;
import factory_method_pattern.pizzas.new_york.NYStyleCheesePizza;
import factory_method_pattern.pizzas.new_york.NYStyleClamPizza;
import factory_method_pattern.pizzas.new_york.NYStylePepperoniPizza;
import factory_method_pattern.pizzas.new_york.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
        if (item.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        } else return null;
    }
}
