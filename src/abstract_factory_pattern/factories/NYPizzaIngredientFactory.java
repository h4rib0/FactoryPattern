package abstract_factory_pattern.factories;

import abstract_factory_pattern.incrediences.cheese.Cheese;
import abstract_factory_pattern.incrediences.cheese.ReggianoCheese;
import abstract_factory_pattern.incrediences.clams.Clams;
import abstract_factory_pattern.incrediences.clams.FreshClams;
import abstract_factory_pattern.incrediences.dough.Dough;
import abstract_factory_pattern.incrediences.dough.ThinCrustDough;
import abstract_factory_pattern.incrediences.pepperoni.Pepperoni;
import abstract_factory_pattern.incrediences.pepperoni.SlicedPepperoni;
import abstract_factory_pattern.incrediences.sauce.MarinaraSauce;
import abstract_factory_pattern.incrediences.sauce.Sauce;
import abstract_factory_pattern.incrediences.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FreshClams();
    }
}
