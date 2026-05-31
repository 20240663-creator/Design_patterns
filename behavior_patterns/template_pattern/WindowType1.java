package behavior_patterns.template_pattern;

public class WindowType1 extends Window{
    @Override
    protected void before_close() {
        System.out.println("Before close action for window 1");
    }

    @Override
    protected void after_close() {
        System.out.println("After close action for window 1");
    }
}
