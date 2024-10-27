package TT1;

public class Address {
    private String street;
    private String city;
    private String state;
    private int postalCode;
    private String country;

    public Address(String street, String city, String state, int postalCode, String country) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    public boolean validate() {
        // Validation logic goes here (example: postal code check)
        return true;
    }

    public String outputAsLabel() {
        return street + ", " + city + ", " + state + " " + postalCode + ", " + country;
    }
}
