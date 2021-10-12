package nl.novi.dpcc.builder.domain.b;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.Garage;
import nl.novi.dpcc.builder.domain.Garden;
import nl.novi.dpcc.builder.domain.HouseType;

public class HouseB {

    //Verplicht
    private Address address;
    private HouseType houseType;

    // Niet verplicht
    private Garden garden;
    private Garage garage;

    public HouseB(Address address, HouseType houseType) {
        this.address = address;
        this.houseType = houseType;
    }

    @Override
    public String toString() {
        return "HouseB{" +
                "address=" + address +
                ", houseType=" + houseType +
                '}';
    }
}
