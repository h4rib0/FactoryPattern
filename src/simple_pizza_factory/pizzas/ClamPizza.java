package simple_pizza_factory.pizzas;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam simple_pizza_factory.pizzas.Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
