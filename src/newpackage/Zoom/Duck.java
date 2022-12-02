package newpackage.Zoom;

public class Duck extends Animal implements Swimable{


    public Duck(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println("Swimming on ocean");
    }

    @Override
    public String toString() {
        return "Duck{}"+
                super.toString();
    }
}
