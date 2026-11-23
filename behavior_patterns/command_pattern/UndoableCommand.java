package behavior_patterns.command_pattern;

public interface UndoableCommand extends Command{
    void unExcute();
}
