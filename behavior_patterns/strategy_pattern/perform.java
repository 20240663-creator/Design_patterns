package behavior_patterns.strategy_pattern;

public class perform {
    private payment p;

    public void pay(payment x){
        p = x;
        p.pay();
    }
}
