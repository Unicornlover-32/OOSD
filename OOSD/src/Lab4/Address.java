package Lab4;

public class Address extends Employee{
    private String street;
    private String city;
    private String county;


    // Costructors
    public Address() {
        street = "";
        city = "";
        county = "";
    }

    public Address(String street, String city, String county) {
        this.street = street;
        this.city = city;
        this.county = county;
    }

    // Getters
    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    // Setters  
    public void setStreet(String street) {
        this.street = street;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setCounty(String county) {
        this.county = county;
    }


    // toString method
    public String toString() {
        return street + ", " + city + ", " + county;
    }
}
