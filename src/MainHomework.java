import java.util.Objects;
import java.util.Scanner;

public class MainHomework {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        method(scanner.next());
    }
    public static void method(String name) {
        if (Objects.equals(name, Week.Monday.name())) {
            System.out.println(Week.Monday.getWhat());
        } else if (Objects.equals(name,Week.Tuesday.name())) {
            System.out.println(Week.Tuesday.getWhat());
        } else if (Objects.equals(name,Week.Wednesday.name())){
            System.out.println(Week.Wednesday.getWhat());
        } else if (Objects.equals(name,Week.Thursday.name())) {
            System.out.println(Week.Thursday.getWhat());
        } else if (Objects.equals(name,Week.Friday.name())) {
            System.out.println(Week.Friday.getWhat());
        } else if (Objects.equals(name,Week.Saturday.name())) {
            System.out.println(Week.Saturday.getWhat());
        } else if (Objects.equals(name,Week.Sunday.name())) {
            System.out.println(Week.Sunday.getWhat());
        }
    }
}



