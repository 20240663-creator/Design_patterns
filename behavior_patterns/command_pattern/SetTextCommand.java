package behavior_patterns.command_pattern;


import java.util.Set;

public class SetTextCommand implements UndoableCommand{
    private VideoEditor videoEditor;
    private String text;
    private History history;

    public SetTextCommand(String txt){
        videoEditor = new VideoEditor();
        this.history = new History();
        this.text = txt;
    }

    @Override
    public void unExcute() {
        history.pop();
    }

    @Override
    public void excute() {
        videoEditor.setText(text);
        history.push(this);
    }
}
