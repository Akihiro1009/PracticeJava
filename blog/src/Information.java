public class Information {
    private final String name = "Akihiro";
    private final int age = 18;
    private final String experience = "1 year";

    public Information() {
    }

    public String getInformation(){
        return "My name is " + name + " and I am " + age + " years old. "+ "I have only  have " + experience + " of Java experience.";
    }
}
