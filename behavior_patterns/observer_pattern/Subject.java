package behavior_patterns.observer_pattern;
import java.util.*;

public class Subject {
    List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void add_observer(Observer obs){
        observers.add(obs);
    }

    public void remove_obs(Observer obs){
        observers.remove(obs);
    }

    protected void notify_All(){
        for (Observer obs : observers){
            obs.update();
        }
    }

}
