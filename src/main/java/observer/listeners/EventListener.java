package observer.listeners;

import observer.EventType;

import java.io.File;

public interface EventListener {
    void update(EventType type, File file);
}
