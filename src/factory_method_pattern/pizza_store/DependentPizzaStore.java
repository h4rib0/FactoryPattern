package factory_method_pattern.pizza_store;

import factory_method_pattern.pizzas.Pizza;
import factory_method_pattern.pizzas.chicago.ChicagoStyleCheesePizza;
import factory_method_pattern.pizzas.chicago.ChicagoStyleClamPizza;
import factory_method_pattern.pizzas.chicago.ChicagoStylePepperoniPizza;
import factory_method_pattern.pizzas.chicago.ChicagoStyleVeggiePizza;
import factory_method_pattern.pizzas.new_york.NYStyleCheesePizza;
import factory_method_pattern.pizzas.new_york.NYStyleClamPizza;
import factory_method_pattern.pizzas.new_york.NYStylePepperoniPizza;
import factory_method_pattern.pizzas.new_york.NYStyleVeggiePizza;

public class DependentPizzaStore {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if (style.equals("NY")) {
            if (type.equals("cheese")) {
                pizza = new NYStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new NYStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new NYStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new NYStylePepperoniPizza();
            }
        } else if (style.equals("Chicago")) {
            if (type.equals("cheese")) {
                pizza = new ChicagoStyleCheesePizza();
            } else if (type.equals("veggie")) {
                pizza = new ChicagoStyleVeggiePizza();
            } else if (type.equals("clam")) {
                pizza = new ChicagoStyleClamPizza();
            } else if (type.equals("pepperoni")) {
                pizza = new ChicagoStylePepperoniPizza();
            }
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
