package behavior_patterns.observer_pattern;

import java.util.ArrayList;
import java.util.List;

public class StatusBar implements Observer {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void show() {
        for (var stock : stocks){
            System.out.println("Stock Bar Status");
            System.out.println(stock);
        }
    }

    @Override
    public void update() {
        show();
    }
}
