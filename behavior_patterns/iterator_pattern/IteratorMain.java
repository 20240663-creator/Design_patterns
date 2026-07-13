package behavior_patterns.iterator_pattern;

public class IteratorMain {
    public static void main(String[] args){
        var productCollection = new ProductCollection();
        productCollection.add(new Product(1,"p1"));
        productCollection.add(new Product(2,"p2"));
        productCollection.add(new Product(3,"p3"));
        productCollection.add(new Product(4,"p4"));

        Iterator iterator = productCollection.createIterator();

        while (iterator.hasNext()){
            System.out.println(iterator.current() + " ");
            iterator.next();
        }
    }
}
