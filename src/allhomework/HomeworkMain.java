package allhomework;

public class HomeworkMain {
    public static void main(String[] args) {
    Flat flat = new Flat("Sadyr",67,"male","Toktogula 32");
    Flat flat1 = new Flat("Kurmanbek",16,"male","Manas 57 entrance 3 № 60 flat");
    Hostel hostel = new Hostel("Aycholpon",15,"male","Воробьевые горы");
    Hostel hostel1 = new Hostel("Daniel",14,"male","Бычье рога");
    Hotel hotel = new Hotel("Dastan",15,"male","Козье молоко");
    Hotel hotel1 = new Hotel("Elbek",14,"female","Геофизика 12");
        System.out.println(flat+"\n"+flat1);
        flat.money();
        System.out.println(hostel+"\n"+hostel1);
        hostel.money();
        System.out.println(hotel+"\n"+hotel1);
        hotel.money();
    }

}
