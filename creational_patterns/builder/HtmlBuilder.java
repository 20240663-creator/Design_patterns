package creational_patterns.builder;

import creational_patterns.builder.html.HtmlDocument;
import creational_patterns.builder.html.HtmlImage;
import creational_patterns.builder.html.HtmlParagraph;

public class HtmlBuilder implements DocumentBuilder{
    private HtmlDocument document = new HtmlDocument();

    @Override
    public void add(Element element) {
        if (element instanceof Text) {
            var text = ((Text)element).getContent();
            document.add(new HtmlParagraph(text));
        }
        else if (element instanceof Image) {
            var source = ((Image)element).getSource();
            document.add(new HtmlImage(source));
        }
    }

    @Override
    public void show() {
        System.out.println(document.toString());
    }
}
