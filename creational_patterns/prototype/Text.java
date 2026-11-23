package creational_patterns.prototype;

public class Text implements Component {
    private String content;

    public Text(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public Component clone() {
        System.out.println("copied data...");
        return new Text(this.content);
    }
}
