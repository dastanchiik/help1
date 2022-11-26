import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                int num = scanner.nextInt();
               int a = num;
               int b = 0;
               while (num >0){
                   num /=10;
                   b++;
               }
               if (b == 1){
                   System.out.println("yes");
               } else if (b == 2) {
                   int percent = a%10;
                   int percent1 = (a/10)%10;
                   if (percent==percent1){
                       System.out.println("Yes");
                   }else {
                       System.out.println("No");
                   }
               } else if (b == 3) {
                   int percent2 = a%10;
                   int percent3 = (a/10)%10;
                   int percent4 = (a/100)%10;
                   if (percent2==percent3 && percent4==percent3 && percent4==percent2){
                       System.out.println("Yes");
                   }else {
                       System.out.println("No");
                   }
               } else if (b == 4) {
                   int percent5 = a%10;
                   int percent6 = (a/10)%10;
                   int percent7 = (a/100)%10;
                   int percent8 = (a/1000)%10;
                   if (percent5==percent6 && percent7==percent8 && percent5==percent7 && percent6==percent8){
                       System.out.println("Yes");
                   }else {
                       System.out.println("No");
                   }
               }
        {

        }
    }
        }