package nl.novi.dpcc.builder.domain.c;

import nl.novi.dpcc.builder.domain.*;

import java.util.List;

public class HouseCBuilder {

    //Verplicht
    private Address address;
    private HouseType houseType;

    // Niet verplicht
    private Garden garden;
    private Garage garage;

    // Minimaal 1 kamer is verplicht
    private List<Room> rooms;

    public HouseCBuilder address(Address address) {
        this.address = address;
        return this;
    }

    public HouseCBuilder houseType(HouseType houseType) {
        this.houseType = houseType;
        return this;
    }

    public HouseCBuilder garden(Garden garden) {
        this.garden = garden;
        return this;
    }

    public HouseCBuilder garage(Garage garage) {
        this.garage = garage;
        return this;
    }

    public HouseCBuilder rooms(List<Room> rooms) {
        this.rooms = rooms;
        return this;
    }

    public HouseC build() {
        if (address == null || houseType == null) {
            throw new IllegalStateException("address and houseType must be set");
        }
        if (rooms == null || rooms.isEmpty()) {
            throw new IllegalStateException("min. 1 room is required");
        }
        return new HouseC(address, houseType, garden, garage, rooms);
    }
}
