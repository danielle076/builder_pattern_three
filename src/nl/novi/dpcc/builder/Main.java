package nl.novi.dpcc.builder;

import nl.novi.dpcc.builder.domain.Address;
import nl.novi.dpcc.builder.domain.HouseType;
import nl.novi.dpcc.builder.domain.Room;
import nl.novi.dpcc.builder.domain.a.HouseA;
import nl.novi.dpcc.builder.domain.a.HouseABuilder;
import nl.novi.dpcc.builder.domain.b.HouseB;
import nl.novi.dpcc.builder.domain.b.HouseBBuilder;
import nl.novi.dpcc.builder.domain.c.HouseC;
import nl.novi.dpcc.builder.domain.c.HouseCBuilder;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        HouseA houseA = new HouseABuilder()
                .address(new Address("Hoofdstraat", 123, "5555VV", "Utrecht", null))
                .houseType(HouseType.APPARTMENT)
                .build();
        System.out.println(houseA);

        HouseB houseB = new HouseBBuilder()
                .address(new Address("Hoofdstraat", 123, "5555VV", "Utrecht", null))
                .houseType(HouseType.APPARTMENT)
                .build();
        System.out.println(houseB);

        HouseC houseC = new HouseCBuilder()
                .address(new Address("Hoofdstraat", 123, "5555VV", "Utrecht", null))
                .houseType(HouseType.APPARTMENT)
                .rooms(List.of(new Room(1,3, "sleepingRoom1"), new Room(11,33, "sleepingRoom2")))
                .build();
        System.out.println(houseC);
    }
}
