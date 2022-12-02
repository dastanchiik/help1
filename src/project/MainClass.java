package project;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        method(scanner.nextInt(), scanner.nextInt());
    }
    public static void method(int min,int max){
        int number = Math.max(min, max);
        System.out.println(number);
    }
}
