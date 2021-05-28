package inheritence.heirarchical;

import inheritence.single.Animal;

public interface Herbivore extends Animal {
    @Override
    public default void eat() {
        System.out.println(this.getClass().getSimpleName() + "eats plant as it is a herbivore.");
    }
}
