package Aggregation2;

public class Address2 {
    String street;
    String resident;
    String country;

    public Address2(String street, String resident, String country){//why isn't it "public String Address"?
        this.street = street;
        this.resident = resident;
        this.country = country;
    }

    public String getAddress2(){
        return street + " , " +  resident + " , " + country;
    }
}
