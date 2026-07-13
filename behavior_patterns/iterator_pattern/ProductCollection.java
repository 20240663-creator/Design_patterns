package behavior_patterns.iterator_pattern;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
  private List<Product> products = new ArrayList<>();

  public void add(Product product) {
    products.add(product);
  }

  public Iterator createIterator(){
      return new ProductIterator(this);
  }

  public class ProductIterator implements Iterator{
      private int size;
      private ProductCollection productCollection;

      public ProductIterator(ProductCollection productCollection) {
          this.size = 0;
          this.productCollection = productCollection;
      }

      @Override
      public Product current() {
          return products.get(size);
      }

      @Override
      public void next() {
          size++;
      }

      @Override
      public boolean hasNext() {
          return size < products.size();
      }
  }

}
