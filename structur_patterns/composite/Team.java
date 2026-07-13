package structur_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Team implements Component {
  private List<Component> components = new ArrayList<>();

  public void add(Component resource) {
    components.add(resource);
  }

  @Override
  public void deploy() {
    for (var resource : components){
        resource.deploy();
    }
  }
}
