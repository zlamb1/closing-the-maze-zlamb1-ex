package org.example;
public class SimpleRoom extends ActionRoom {
    public SimpleRoom(String name) {
        // you could also create an anonymous Lootable class and create custom looting functionality.
        super(name, new Lootable());
    }
    @Override
    public String getDescription() {
        return "'Minimalist' would be a nice way of describing this room.";
    }
}
