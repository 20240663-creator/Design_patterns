package behavior_patterns.iterator_pattern;

public interface Iterator {
    Product current();
    void next();
    boolean hasNext();
}
