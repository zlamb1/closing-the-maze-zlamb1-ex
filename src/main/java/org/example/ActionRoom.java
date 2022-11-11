package org.example;
import org.example.depend.Player;
import org.example.depend.Room;
public abstract class ActionRoom extends Room {
    private final IAction action;
    public ActionRoom(String name, IAction action) {
        super(name);
        this.action = action;
    }
    public final String doAction(Player player) {
        return action.doAction(player);
    }
}
