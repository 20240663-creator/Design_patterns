package behavior_patterns.strategy_pattern;

public class cash implements payment{
    @Override
    public void pay() {
        System.out.println("cash method");
    }
}
