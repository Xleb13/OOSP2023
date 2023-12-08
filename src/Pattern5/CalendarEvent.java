package Pattern5;

public class CalendarEvent {
    private String eventName;
    private String eventDate;

    public CalendarEvent(String eventName, String eventDate) {
        this.eventName = eventName;
        this.eventDate = eventDate;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDate() {
        return eventDate;
    }
}
