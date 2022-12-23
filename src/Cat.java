public record Cat(String name,int age) {
    public Cat {
        if (age < 0 ){
            System.out.println("You are stupid ?");
        }
    }
}
