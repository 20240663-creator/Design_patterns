package behavior_patterns.memento_pattern;


public class MementoMain {
    public static void main(String[] args){
        Document doc = new Document("Hello", "Arial", 12);
        doc.save();
        System.out.println("After first save: " + doc);

        doc.setContent("Hello World");
        doc.save();
        System.out.println("After second save: " + doc);

        doc.undo();
        System.out.println("After undo: " + doc);

        doc.undo();
        System.out.println("After second undo: " + doc);
    }
}
