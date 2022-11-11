package org.example;
import org.example.depend.Player;
public class Lootable implements IAction {
    // I think one of the main benefits of this approach is the ability to add default functionality.
    @Override
    public String doAction(Player player) {
        player.addToInventory("Wooden scraps");
        return "Wow, there were some amazing treasures hidden here... at one time.";
    }
}
