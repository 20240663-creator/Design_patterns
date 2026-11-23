package creational_patterns.prototype;

public class Clip implements Component {
    @Override
    public Component clone() {
        System.out.println("copied data...");
        return new Clip();
    }
}
