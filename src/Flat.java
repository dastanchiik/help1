public class Flat extends Person implements Money {
    public Flat(String name, int age, String gender, String address) {
        super(name, age, gender, address);
    }

    @Override
    public void money() {
        System.out.println("public service: 30k for a per month");
    }

    @Override
    public String toString() {
        return "Flat{}"+
                super.toString();
    }
}
