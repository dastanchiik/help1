package newpackage.Zoom;

public class Turtle extends Animal implements Swimable{


    public Turtle(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println("walks slowly");
    }

    @Override
    public String toString() {
        return "Turtle{}"+
                super.toString();
    }
}
