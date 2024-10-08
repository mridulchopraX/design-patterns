package com.example.logger;

import com.example.event.Event;
import com.example.event.FileLoggingEvent;
import com.example.event.FileSendingEvent;
import com.example.event.listener.EventListener;

public class FileLogger implements EventListener {

    private void log(String message) {
        System.out.println("<FileLogger> " + message);
    }

    @Override
    public void onEvent(Event event) {
        String message = switch (event) {
            case FileLoggingEvent fileLoggingEvent -> "{"
                    + fileLoggingEvent.fileName + ", "
                    + fileLoggingEvent.action + ", "
                    + fileLoggingEvent.message
                    + "}";

            case FileSendingEvent fileSendingEvent -> "{"
                    + fileSendingEvent.to + ", "
                    + fileSendingEvent.subject + ", "
                    + fileSendingEvent.action
                    + "}";

            default -> "";
        };
        log(message);
    }
}
