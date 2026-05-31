package behavior_patterns.template_pattern;

public abstract class Window {
    public void close() {
        before_close();

        System.out.println("Removing the window from the screen");

        after_close();
    }

    protected void before_close(){return;}
    protected void after_close(){return;}
}
