package TT1;

public class Person {
    protected String name;
    protected String phoneNumber;
    protected String emailAddress;
    protected Address address;

    public Person(String name, String phoneNumber, String emailAddress, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    public void purchaseParkingPass() {
        // Parking pass purchase logic
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return this.address;
    }
}
