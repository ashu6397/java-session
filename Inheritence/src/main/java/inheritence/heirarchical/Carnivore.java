package inheritence.heirarchical;

import inheritence.single.Animal;

public interface Carnivore extends Animal {
    @Override
    public default void eat() {
        System.out.println(this.getClass().getSimpleName() + " eats a herbivore as it is a carnivore");
    }
}
