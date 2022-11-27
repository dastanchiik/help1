import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
      String a = scanner.next();
      int count = a.length();
     int counter = 0;
     while (counter != count){
         System.out.println(a.substring(counter));
         counter++;
     }
    }
        }