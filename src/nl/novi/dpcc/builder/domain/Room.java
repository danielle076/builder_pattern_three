package nl.novi.dpcc.builder.domain;

public class Room {
    private double length;
    private double width;
    private String roomName;

    public Room(double length, double width, String roomName) {
        this.length = length;
        this.width = width;
        this.roomName = roomName;
    }

    @Override
    public String toString() {
        return "Room{" +
                "length=" + length +
                ", width=" + width +
                ", roomName='" + roomName + '\'' +
                '}';
    }

}
