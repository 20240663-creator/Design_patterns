package behavior_patterns.state_pattern;

public class Bicycling implements Service{

    @Override
    public void getEta() {
        System.out.println("Calculating ETA (bicycling)");
    }
}
