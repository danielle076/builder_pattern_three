package nl.novi.dpcc.builder.domain.c;

import nl.novi.dpcc.builder.domain.*;

import java.util.List;

public class HouseC {

    //Verplicht
    private Address address;
    private HouseType houseType;

    // Niet verplicht
    private Garden garden;
    private Garage garage;

    // Minimaal 1 kamer is verplicht
    private List<Room> rooms;

    public HouseC(Address address, HouseType houseType, Garden garden, Garage garage, List<Room> rooms) {
        this.address = address;
        this.houseType = houseType;
        this.garden = garden;
        this.garage = garage;
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "HouseC{" +
                "address=" + address +
                ", houseType=" + houseType +
                ", garden=" + garden +
                ", garage=" + garage +
                ", rooms=" + rooms +
                '}';
    }

}
