package inheritence.multilevel;

import inheritence.heirarchical.Carnivore;

public class Tiger implements Carnivore {
    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + "eats another animal too, just like lion.");
    }
}
