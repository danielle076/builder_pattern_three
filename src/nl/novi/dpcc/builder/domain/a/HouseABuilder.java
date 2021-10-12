package nl.novi.dpcc.builder.domain.a;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.HouseType;

public class HouseABuilder {

    private Address address;
    private HouseType houseType;

    public HouseABuilder address(Address address) {
        this.address = address;
        return this;
    }

    public HouseABuilder houseType(HouseType houseType) {
        this.houseType = houseType;
        return this;
    }

    public HouseA build() {
        if (address == null || houseType == null) {
            throw new IllegalStateException("address and houseType must be set");
        }
        return new HouseA(address, houseType);
    }
}
