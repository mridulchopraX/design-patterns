package com.example.event.manager;

import com.example.event.Event;
import com.example.event.EventType;
import com.example.event.listener.EventListener;

import java.util.ArrayList;

public class EventManagerImpl implements EventManager {

    @Override
    public void subscribe(EventType eventType, EventListener listener) {
        subscribers.putIfAbsent(eventType, new ArrayList<>());
        subscribers.get(eventType).add(listener);
        System.out.println("<EventManagerImpl> Subscribed to event type: " + eventType + " with listener: " + listener.getClass());

    }

    @Override
    public void unsubscribe(EventType eventType, EventListener listener) {
        subscribers.getOrDefault(eventType, new ArrayList<>()).remove(listener);
        System.out.println("<EventManagerImpl> Unsubscribed from event type: " + eventType + " with listener: " + listener.getClass());
    }

    @Override
    public void notify(EventType eventType, Event event) {
        System.out.println("<EventManagerImpl> Notifying subscribers of event type: " + eventType);
        var listeners = subscribers.get(eventType);
        listeners = listeners == null ? new ArrayList<>() : listeners;
        listeners.forEach(listener -> listener.onEvent(event));
    }
}
