package behavior_patterns.command_pattern;

import java.util.ArrayList;
import java.util.List;

public class History {
    private List<UndoableCommand> history;

    public History(){
        history = new ArrayList<>();
    }

    public void push(UndoableCommand command){
        history.add(command);
    }

    public UndoableCommand pop(){
        if (history.isEmpty()) {
            var command = history.getLast();
            history.remove(command);
            return command;
        }
        return null;
    }
}
