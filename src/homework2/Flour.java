package homework2;

public abstract class Flour {
    private String name;

    public Flour(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Flour{" +
                "name='" + name + '\'' +
                '}';
    }
}
