package abstract_factory_pattern.factories;

import abstract_factory_pattern.incrediences.cheese.Cheese;
import abstract_factory_pattern.incrediences.cheese.MozzarellaCheese;
import abstract_factory_pattern.incrediences.clams.Clams;
import abstract_factory_pattern.incrediences.clams.FrozenClams;
import abstract_factory_pattern.incrediences.dough.Dough;
import abstract_factory_pattern.incrediences.dough.ThickCrustDough;
import abstract_factory_pattern.incrediences.pepperoni.Pepperoni;
import abstract_factory_pattern.incrediences.pepperoni.SlicedPepperoni;
import abstract_factory_pattern.incrediences.sauce.PlumTomatoSauce;
import abstract_factory_pattern.incrediences.sauce.Sauce;
import abstract_factory_pattern.incrediences.veggies.BlackOlives;
import abstract_factory_pattern.incrediences.veggies.Eggplant;
import abstract_factory_pattern.incrediences.veggies.Spinach;
import abstract_factory_pattern.incrediences.veggies.Veggies;

public class ChicagoPizzaIngredientFactory
        implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThickCrustDough();
    }

    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {new BlackOlives(),
                new Spinach(),
                new Eggplant()};
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    public Clams createClam() {
        return new FrozenClams();
    }
}
