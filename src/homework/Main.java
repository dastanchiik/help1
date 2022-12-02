package homework;

public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread("Bread");
        System.out.println(bread);
        bread.baked();
        Pie pie = new Pie("Pie");
        System.out.println(pie);
        pie.baked();
        Bun bun = new Bun("Bun");
        System.out.println(bun);
        bun.baked();
    }
}
