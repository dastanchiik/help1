import java.util.Scanner;

public class MainHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        method();
    }

    public static void method() {
        Scanner scanner = new Scanner(System.in);
        Cat cat = new Cat(scanner.next(), scanner.nextInt());
    }
}