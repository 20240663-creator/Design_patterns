package behavior_patterns.observer_pattern;

public class ObserverMain {
    public static void main(String[] args){
        StatusBar statusBar = new StatusBar();
        StockListView stockList = new StockListView();

        Stock s1 = new Stock("a",10);
        Stock s2 = new Stock("b",15);
        Stock s3 = new Stock("c",20);

        statusBar.addStock(s1);
        statusBar.addStock(s2);

        stockList.addStock(s1);
        stockList.addStock(s2);
        stockList.addStock(s3);


        s1.add_observer(statusBar);
        s1.add_observer(stockList);
        s2.add_observer(statusBar);
        s2.add_observer(stockList);
        s3.add_observer(statusBar);
        s3.add_observer(stockList);

        s1.setPrice(20);

        System.out.println("------------------------");
        
        s2.setPrice(50);

    }
}
