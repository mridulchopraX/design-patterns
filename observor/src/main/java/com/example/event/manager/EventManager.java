package com.example.event.manager;

import com.example.event.Event;
import com.example.event.EventType;
import com.example.event.listener.EventListener;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EventManager {

    Map<EventType, List<EventListener>> subscribers = new HashMap<>();

    void subscribe(EventType eventType, EventListener listener);
    void unsubscribe(EventType eventType, EventListener listener);
    void notify(EventType eventType, Event event);
}
