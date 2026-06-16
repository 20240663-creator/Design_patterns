package behavior_patterns.memento_pattern;

public class Document {
    private String content;
    private String fontName;
    private int fontSize;
    private History history;

    public Document(String c, String fn, int fs) {
        this.content = c;
        this.fontName = fn;
        this.fontSize = fs;
        this.history = new History();
    }

    public void save() {
        history.push(new DocumentState(content, fontName, fontSize));
    }

    public void undo() {
        if (!history.isEmpty()) {
            DocumentState lastState = history.pop();
            this.content = lastState.getContent();
            this.fontName = lastState.getFontName();
            this.fontSize = lastState.getFontSize();
        }
    }

    public void setContent(String content) { this.content = content; }
    public void setFontName(String fontName) { this.fontName = fontName; }
    public void setFontSize(int fontSize) { this.fontSize = fontSize; }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}