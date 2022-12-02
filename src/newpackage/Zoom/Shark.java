package newpackage.Zoom;

public class Shark extends Animal implements Swimable{



    public Shark(String name) {
        super(name);
    }


    @Override
    public void swimming() {
        System.out.println("Swimming in ocean");
    }

    @Override
    public String toString() {
        return "Shark{}"+
                super.toString();
    }
}
