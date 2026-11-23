package creational_patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class TextBuilder implements DocumentBuilder{
    private List<Element> elements = new ArrayList<>();

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void show() {
        for (Element element: elements) {
            if (element instanceof Text) {
                System.out.println(((Text)element).getContent());
            }
        }
    }

    List<Element> getElements(){
        return elements;
    }
}
