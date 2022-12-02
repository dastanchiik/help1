package homework;

public class Bread extends Flour implements Bakedable{


    public Bread(String name) {
        super(name);
    }

    @Override
    public void baked() {
        System.out.println("made without sugar");
    }

    @Override
    public String toString() {
        return "Bread{}"+
                super.toString();
    }
}