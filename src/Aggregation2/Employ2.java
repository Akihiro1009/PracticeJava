package Aggregation2;

public class Employ2 {
    int id2;
    String name;
    int age;
    Address2 address2;

    public Employ2(int id2, String name, int age, Address2 address2){
        this.id2 = id2;
        this.name = name;
        this.age = age;
        this.address2 = address2;
    }

    public String getEmploy(){
        return "id : " + id2 + " | name : " + name + " | age : " + age + " | address: " + address2.getAddress2();
    }

    public void display2(){
        System.out.println(address2.getAddress2());
        System.out.println(getEmploy());
    }

}
