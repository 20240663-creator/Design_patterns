package structur_patterns.decorator;

public class IsMain implements Component{
    private Component component;

    public IsMain(Component component) {
        this.component = component;
    }

    @Override
    public String render() {
        return String.format("%s %s", "Main ", component.render());
    }
}
