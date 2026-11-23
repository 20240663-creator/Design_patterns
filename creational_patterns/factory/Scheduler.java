package creational_patterns.factory;

import java.util.Date;

public class Scheduler {
    private Calendar calendar = createCalender();

    public Calendar createCalender(){
        return new Calendar();
    }

    public void schedule(Event event) {
        var today = new Date();
        calendar.addEvent(event, today);
    }
}
