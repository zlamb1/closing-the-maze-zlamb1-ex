package org.example;
import org.example.depend.Player;
public class Main {
    public static void main(String[] args) {
        ActionRoom room = new SimpleRoom("Test Room");
        Player player = new Player();
        System.out.println(room.doAction(player));
        System.out.println();
    }
}