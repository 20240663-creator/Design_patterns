package behavior_patterns.template_pattern;

public class WindowType2 extends Window{
    @Override
    protected void before_close() {
        System.out.println("Before close action for window 2");
    }

    @Override
    protected void after_close() {
        System.out.println("After close action for window 2");
    }
}
