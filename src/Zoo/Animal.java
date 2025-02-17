package Zoo;
import java.util.Date;

public class Animal {
    private String name;

    private int age;
    private int a;

    public void add(){
        a = 1;
    }

    public void add(int a, int b){
        //code
    }

    public int add(int a, int b, int c){
        return a;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void talk(){
        System.out.println("Animal doesn't talk");
    }

    public void eat(){
        System.out.println("Animal eats something...");
    }

    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + "]";
    }
}
