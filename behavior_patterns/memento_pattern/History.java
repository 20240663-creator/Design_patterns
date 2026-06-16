package behavior_patterns.memento_pattern;

import java.util.Stack;

public class History {
    private Stack<DocumentState> states;

    public History() {
        states = new Stack<>();
    }

    public void push(DocumentState state) {
        states.push(state);
    }

    public DocumentState pop() {
        return states.pop();
    }

    public boolean isEmpty() {
        return states.isEmpty();
    }
}