package simplePizzaFactory;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        name = "Clam simplePizzaFactory.Pizza";
        dough = "Thin crust";
        sauce = "White garlic sauce";
        toppings.add("Clams");
        toppings.add("Grated parmesan cheese");
    }
}
