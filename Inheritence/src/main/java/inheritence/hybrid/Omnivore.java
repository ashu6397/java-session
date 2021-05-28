package inheritence.hybrid;

import inheritence.heirarchical.Carnivore;
import inheritence.heirarchical.Herbivore;

public class Omnivore implements Carnivore, Herbivore {
    public enum Meal {
        VEG, NON_VEG
    }

    public void setTypeOfMeal(Meal typeOfMeal) {
        this.typeOfMeal = typeOfMeal;
    }

    private Meal typeOfMeal = Meal.NON_VEG;

    @Override
    public void eat() {
        if (typeOfMeal == Meal.NON_VEG)
            Carnivore.super.eat();
        else Herbivore.super.eat();
        drinkWater();
    }
}
