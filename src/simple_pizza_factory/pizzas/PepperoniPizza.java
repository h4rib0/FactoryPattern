package simple_pizza_factory.pizzas;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza() {
        name = "Pepperoni simple_pizza_factory.pizzas.Pizza";
        dough = "Crust";
        sauce = "Marinara sauce";
        toppings.add("Sliced Pepperoni");
        toppings.add("Sliced Onion");
        toppings.add("Grated parmesan cheese");
    }
}
