package behavior_patterns.strategy_pattern;

public class paypal implements payment{
    @Override
    public void pay(){
        System.out.println("paypal method");
    }
}
