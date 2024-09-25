package Zoo;

public class Cat extends Animal{
    private String hair;

    public Cat(String name, int age, String hair) {
        super(name, age);
        this.hair = hair;
    }

    public String getHair(){
        return hair;
    }

    public String setHair(String hair){
        this.hair = hair;
        return hair;
    }

    public void talk() {
        System.out.println("meyaw");
    }

    public void eat() {
        System.out.println("mushamusha");
    }

    @Override
    public String toString() {
        return super.toString() + hair;

        //return "Animal [name=" + name + ", age=" + age + "]"
    }
}
