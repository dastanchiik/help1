import java.util.Scanner;
public class MainHomework {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        method(scanner.next(), scanner.nextInt());
    }
    public static void method(String name,int age) {
        Scanner scanner = new Scanner(System.in);
        Cat cat = new Cat(name, age);
        if (cat.age()<0) {
            System.out.println("cat name: "+cat.name()+"cat age is negative");
        }else {
            System.out.println(cat);
        }
    }
}