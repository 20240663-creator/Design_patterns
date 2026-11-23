package creational_patterns.factory;

import java.util.Date;

public class ArabianCalender extends Calendar{
    @Override
    void addEvent(Event event, Date date) {
        System.out.println("Adding an event on the given date Arabian Calender.");
    }
}
