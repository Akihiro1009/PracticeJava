package Zoo;

public class Test {
    public static void main(String[] args) {
        Animal mouse = new Animal("mouse", 10);
        System.out.println(mouse);
        System.out.println(mouse.getName() + " is " + mouse.getAge() + " years old");
        mouse.setName("mouseeeeee");
        System.out.println("Name: " + mouse.getName() + " | Age: " + mouse.getAge() + " years old");
        mouse.talk();
        mouse.eat();

        Cat catty = new Cat("catty", 100, "short");
        System.out.println(catty);
        System.out.println(catty.getName() + " is " + catty.getAge() + " years old and her hair is " + catty.getHair());
        catty.setName("cash");
        System.out.println("Name: " + catty.getName() + " | Age: " + catty.getAge() + " | Hair: " + catty.getHair());
        catty.talk();
        catty.eat();

        Animal a1 = new Animal("tester",10);
    }
}
