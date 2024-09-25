package AggregationPractice;

class Address{
    String street,city,country;
    public Address(String street, String city, String country){
        this.street = street;
        this.city = city;
        this.country = country;
    }

    public String getAddress(){
        return street+", "+city+", "+country;
    }
}

public class AggressionMain{

    int id;
    String name;
    int age;
    Address address;

    public AggressionMain(int id, String name, int age, Address address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void display(){
        System.out.print("ID : " + id + " | Name : " + name + " | age : " + age + " | Address : " /*+ Address.getAddress*/);
        System.out.println(address.getAddress());
    }

    public static void main(String[] args) {
        Address address1 = new Address("Killenee Road", "Singapore","Singapore");
        AggressionMain empo1 = new AggressionMain(007, "Jacob", 69, address1);

        empo1.display();
    }



}
