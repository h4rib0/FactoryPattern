package abstract_factory_pattern.factories;

import abstract_factory_pattern.incrediences.cheese.Cheese;
import abstract_factory_pattern.incrediences.clams.Clams;
import abstract_factory_pattern.incrediences.dough.Dough;
import abstract_factory_pattern.incrediences.pepperoni.Pepperoni;
import abstract_factory_pattern.incrediences.sauce.Sauce;
import abstract_factory_pattern.incrediences.veggies.Veggies;

public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
