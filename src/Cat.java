public record Cat(String name,int age) {
    public Cat {
        if (age < 0 ){
            System.err.println("You are stupid ?");
        }
    }
}



