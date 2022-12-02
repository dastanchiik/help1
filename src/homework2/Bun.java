package homework2;

public class Bun extends Flour implements Bakedable{
    public Bun(String name) {
        super(name);
    }

    @Override
    public void baked() {
        System.out.println("stuffed");
    }

    @Override
    public String toString() {
        return "Bun{}"+
                super.toString();
    }
}
