package homework;

public class Pie extends Flour implements Bakedable{
    public Pie(String name) {
        super(name);
    }



    @Override
    public String toString() {
        return "Pie{}"+
                super.toString();
    }

    @Override
    public void baked() {
        System.out.println("made with sugar");
    }
}
