package nl.novi.dpcc.builder.domain.a;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.HouseType;

public class HouseA {

    //Verplicht
    private Address address;
    private HouseType houseType;

    public HouseA(Address address, HouseType houseType) {
        this.address = address;
        this.houseType = houseType;
    }

    @Override
    public String toString() {
        return "HouseA{" +
                "address=" + address +
                ", houseType=" + houseType +
                '}';
    }
}
