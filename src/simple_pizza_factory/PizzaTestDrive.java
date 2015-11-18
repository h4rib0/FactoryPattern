package simple_pizza_factory;

import simple_pizza_factory.pizzas.Pizza;

public class PizzaTestDrive {

    public static void main(String[] args) {

        SimplePizzaFactory factory = new SimplePizzaFactory();

        PizzaStore store = new PizzaStore(factory);

        Pizza pizza = store.orderPizza("cheese");
        System.out.println("We ordered a " + pizza.getName() + "\n");

        pizza = store.orderPizza("veggie");
        System.out.println("We ordered a " + pizza.getName() + "\n");
    }
}
