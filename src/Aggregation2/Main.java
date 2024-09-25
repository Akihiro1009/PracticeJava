package Aggregation2;

public class Main {
    public static void main(String[] args) {
        Address2 address_of_tom = new Address2("Killeny Road", "Residence @ Killeny", "Singapore");
        Employ2 info_of_tom = new Employ2(1009, "Tom", 69, address_of_tom);

        info_of_tom.display2(); //why does display2 need to be in Employ2 Class?

        System.out.println("I am AKi");
    }

    /*
    public void display2(){
        System.out.println("hi");
        System.out.println("hi");

    }
    */
}
