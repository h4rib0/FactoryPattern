package simple_pizza_factory.pizzas;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese simple_pizza_factory.pizzas.Pizza";
        dough = "Regular Crust";
        sauce = "Marinara simple_pizza_factory.pizzas.Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
