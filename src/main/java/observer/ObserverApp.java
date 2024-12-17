package observer;

import observer.listeners.EmailNotificationListener;
import observer.listeners.LogOpenListener;

public class ObserverApp {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe(EventType.OPEN, new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe(EventType.SAVE, new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
