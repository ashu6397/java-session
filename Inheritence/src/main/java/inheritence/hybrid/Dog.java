package inheritence.hybrid;

public class Dog extends Omnivore {
    public void eat(Meal meal) {
        super.setTypeOfMeal(meal);
        super.eat();
    }
}
