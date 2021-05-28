package inheritence;

import inheritence.hybrid.Dog;
import inheritence.hybrid.Omnivore;
import inheritence.multilevel.Lion;

public class AnimalKingdom {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        Dog dog = new Dog();
        dog.eat(Omnivore.Meal.VEG);
    }
}
