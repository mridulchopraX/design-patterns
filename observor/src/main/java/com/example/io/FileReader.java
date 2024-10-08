package com.example.io;

import com.example.event.EventType;
import com.example.event.FileLoggingEvent;
import com.example.event.FileSendingEvent;
import com.example.event.manager.EventManager;

public class FileReader {

    private final EventManager eventManager;

    public FileReader(EventManager eventManager) {
        this.eventManager = eventManager;
    }

    public void readFile(String fileName) {
        System.out.println("<FileReader> Reading file: " + fileName);

        FileLoggingEvent eventData = new FileLoggingEvent();
        eventData.fileName = fileName;
        eventData.action = "read";
        eventData.message = "File read successfully";

        eventManager.notify(EventType.FILE_READ, eventData);
    }

    public void closeFile(String fileName) {
        System.out.println("<FileReader> Closing file");

        FileLoggingEvent eventData = new FileLoggingEvent();
        eventData.action = "close";
        eventData.message = "File closed successfully";
        eventData.fileName = fileName;

        eventManager.notify(EventType.FILE_CLOSED, eventData);
    }

    public void openFile(String fileName) {
        System.out.println("<FileReader> Opening file: " + fileName);

        FileLoggingEvent eventData = new FileLoggingEvent();
        eventData.fileName = fileName;
        eventData.action = "open";
        eventData.message = "File opened successfully";

        eventManager.notify(EventType.FILE_OPENED, eventData);
    }

    public void sendFileContents() {
        System.out.println("<FileReader> Sending file contents");

        FileSendingEvent eventData = new FileSendingEvent();
        eventData.action = "send";
        eventData.to = "hello@world.com";
        eventData.subject = "Sending file contents";
        eventData.contents = "This is the file content !!";

        eventManager.notify(EventType.FILE_SEND, eventData);
    }
}
