package creational_patterns.builder;

import creational_patterns.builder.html.HtmlImage;
import creational_patterns.builder.html.HtmlParagraph;
import creational_patterns.builder.html.HtmlDocument;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Document {
    private List<Element> elements = new ArrayList<>();

    public void add(Element element) {
        elements.add(element);
    }

    public void export(DocumentBuilder builder) throws IOException {
        for (Element element: elements) {
            builder.add(element);
        }
        builder.show();
    }
}
