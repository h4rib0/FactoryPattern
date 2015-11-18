package simplePizzaFactory;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        name = "Cheese simplePizzaFactory.Pizza";
        dough = "Regular Crust";
        sauce = "Marinara simplePizzaFactory.Pizza Sauce";
        toppings.add("Fresh Mozzarella");
        toppings.add("Parmesan");
    }
}
