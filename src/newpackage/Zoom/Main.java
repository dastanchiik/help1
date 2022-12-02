package newpackage.Zoom;

public class Main {
    public static void main(String[] args) {
//        method();
//    }
//    public static void method(){
        Shark shark = new Shark("Genri");
        Shark shark1 = new Shark("Gozu kyishyk");
        Shark shark2 = new Shark("Bety kara");
        Shark shark3 = new Shark("Aryk");
        Shark shark4 = new Shark("Kok bet");
        Shark[] sharks = {shark,shark1,shark2,shark3,shark4};
        Duck duck = new Duck("Chuy");
        Duck duck1 = new Duck("Talas");
        Duck duck2 = new Duck("Bishkek");
        Duck duck3 = new Duck("Batken");
        Duck duck4 = new Duck("Kara balta");
        Duck[] ducks = {duck,duck1,duck2,duck3,duck4};
        Turtle turtle = new Turtle("Byljyrak");
        Turtle turtle1 = new Turtle("Tabylbak");
        Turtle turtle2 = new Turtle("Sonun");
        Turtle turtle3 = new Turtle("Sonya");
        Turtle turtle4 = new Turtle("Wenin");
        Turtle[] turtles = {turtle,turtle1,turtle2,turtle3,turtle4};
        for (Shark a:sharks ) {
            System.out.println(a+"\n");
        }
        shark.swimming();
        for (Duck a:ducks ) {
            System.out.println(a+"\n");
        }
        duck.swimming();
        for (Turtle a:turtles ) {
            System.out.println(a+"\n");
        }
        turtle.swimming();
    }
}
