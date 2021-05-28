package inheritence.multilevel;

import inheritence.heirarchical.Herbivore;

public class Deer implements Herbivore {
    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " is eating grass, peacefully.");
    }
}
