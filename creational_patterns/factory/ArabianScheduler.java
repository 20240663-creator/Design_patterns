package creational_patterns.factory;

public class ArabianScheduler extends Scheduler {
    @Override
    public Calendar createCalender() {
        return new ArabianCalender();
    }
}
