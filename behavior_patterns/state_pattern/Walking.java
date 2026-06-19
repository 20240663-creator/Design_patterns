package behavior_patterns.state_pattern;

public class Walking implements Service{
    @Override
    public void getEta() {
        System.out.println("Calculating ETA (Walking)");
    }
}
