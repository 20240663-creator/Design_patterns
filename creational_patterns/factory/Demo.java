package creational_patterns.factory;

public class Demo {
    public static void main(String[] args) {
        var scheduler = new Scheduler();
        scheduler.schedule(new Event());

        var arabianScheduler = new ArabianScheduler();
        arabianScheduler.schedule(new Event());
    }
}
