import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String name = scanner.next();
       int count = name.length();
       int counter = 0;
        while (counter != count){
            System.out.println(name.substring(counter));
       counter++;
        }
    }
        }

