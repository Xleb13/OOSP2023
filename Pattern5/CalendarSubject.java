package Pattern5;

import java.util.ArrayList;
import java.util.List;

public class CalendarSubject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }


    public void notifyObservers(String event) {
        for (Observer observer : observers) {
            observer.update(event);
        }
    }

    public void addEvent(CalendarEvent event) {

        notifyObservers(": " + event.getEventName() + " | " + event.getEventDate());
    }
}