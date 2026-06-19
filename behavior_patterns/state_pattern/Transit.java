package behavior_patterns.state_pattern;

public class Transit implements Service{
    @Override
    public void getEta() {
        System.out.println("Calculating ETA (transit)");
    }
}
