package Pattern5;

public class CalendarApp {
    public static void main(String[] args) {

        CalendarSubject calendar = new CalendarSubject();

        User user1 = new User("Пользователь");

        calendar.addObserver(user1);

        CalendarEvent event1 = new CalendarEvent("Сдача практики", "2023-12-01");
        CalendarEvent event2 = new CalendarEvent("Сдача курсовой", "2023-12-12");

        calendar.addEvent(event1);
        calendar.addEvent(event2);

    }
}
