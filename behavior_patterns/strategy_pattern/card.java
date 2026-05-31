package behavior_patterns.strategy_pattern;

public class card implements payment{

    @Override
    public void pay() {
        System.out.println("credit card payment");
    }
}
