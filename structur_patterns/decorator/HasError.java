package structur_patterns.decorator;

public class HasError implements Component{

    private Component component;

    public HasError(Component component) {
        this.component = component;
    }

    @Override
    public String render() {
        return String.format("%s %s", "Error ", component.render());
    }
}
