package inheritence.single;

public interface Animal {
    public void eat();

    public default void drinkWater() {
        System.out.println(this.getClass().getSimpleName() + " drinks water");
    }
}
