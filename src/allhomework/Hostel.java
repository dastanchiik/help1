package allhomework;

public class Hostel extends Person implements Money{
    public Hostel(String name, int age, String gender,String address) {
        super(name, age, gender, address);
    }

    @Override
    public void money() {
        System.out.println("rent: 30k for a per month");
    }

    @Override
    public String toString() {
        return "Hostel{}"+
                super.toString();
    }
}
