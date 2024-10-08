package com.example.event.listener;

import com.example.event.Event;
import com.example.event.FileLoggingEvent;

public interface EventListener {
    void onEvent(Event event);
}
