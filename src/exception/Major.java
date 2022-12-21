package exception;

import java.util.Scanner;

public class Major {
    public static void main(String[] args) {
    method();
    }
    public static void method(){
        Scanner scanner = new Scanner(System.in);
        try {
        System.out.print("Enter name:");
        String name = scanner.next();
        System.out.print("Enter age:");
        int age = scanner.nextInt();
        }catch (Exception e){
            System.out.println("\n it's wrong");
        }
    }
}
