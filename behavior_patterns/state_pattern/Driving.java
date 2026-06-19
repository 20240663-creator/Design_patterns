package behavior_patterns.state_pattern;

public class Driving implements Service{

    @Override
    public void getEta() {
        System.out.println("Calculating ETA (driving)");
    }
}
