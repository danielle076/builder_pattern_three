package nl.novi.dpcc.builder.domain.b;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.HouseType;

public class HouseBBuilder {

    private Address address;
    private HouseType houseType;

    public HouseBBuilder address(Address address) {
        this.address = address;
        return this;
    }

    public HouseBBuilder houseType(HouseType houseType) {
        this.houseType = houseType;
        return this;
    }

    public HouseB build() {
        if (address == null || houseType == null) {
            throw new IllegalStateException("address and houseType must be set");
        }
        return new HouseB(address, houseType);
    }
}
