package nl.novi.dpcc.builder.domain;

public class Address {
    private String streetName;
    private int houseNumber;
    private String postalCode;
    private String city;

    //Niet verplicht
    private String houseNumberAddition;

    public Address(String streetName, int houseNumber, String postalCode, String city, String houseNumberAddition) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.houseNumberAddition = houseNumberAddition;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", houseNumber=" + houseNumber +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                ", houseNumberAddition='" + houseNumberAddition + '\'' +
                '}';
    }

}
