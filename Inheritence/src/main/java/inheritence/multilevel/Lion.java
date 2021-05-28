package inheritence.multilevel;

import inheritence.heirarchical.Carnivore;

public class Lion implements Carnivore {
    @Override
    public void eat() {
        System.out.println(this.getClass().getSimpleName() + " eats a herbivore, probably a deer 😅");
    }
}
