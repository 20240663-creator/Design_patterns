package creational_patterns.prototype;

public class Audio implements Component {
    @Override
    public Component clone() {
        System.out.println("copied data...");
        return new Audio();
    }
}
