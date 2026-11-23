package creational_patterns.builder;

import java.io.IOException;

public class BuilderMain {
    public static void main() throws IOException {
        var document = new Document();
        document.add(new Text("Hello World"));
        document.add(new Image("pic1.jpg"));

        document.export(new TextBuilder());
        
        document.export(new HtmlBuilder());
    }
}
