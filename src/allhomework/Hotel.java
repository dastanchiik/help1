package allhomework;

public class Hotel extends Person implements Money{
    public Hotel(String name, int age, String gender,String address) {
        super(name, age, gender,address);
    }

    @Override
    public void money() {
        System.out.println("rent: 30k for a per month");
    }

    @Override
    public String toString() {
        return "Hotel{}"+
                super.toString();
    }
}
