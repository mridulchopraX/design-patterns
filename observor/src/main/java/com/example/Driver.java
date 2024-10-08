package com.example;

import com.example.event.EventType;
import com.example.event.manager.EventManager;
import com.example.event.manager.EventManagerImpl;
import com.example.io.FileReader;
import com.example.logger.FileLogger;
import com.example.mailer.EmailSender;

public class Driver {

    public static void main(String[] args) {
        EventManager eventManager = new EventManagerImpl();
        FileLogger logger = new FileLogger();
        EmailSender emailSender = new EmailSender();

        eventManager.subscribe(EventType.FILE_OPENED, logger);
        eventManager.subscribe(EventType.FILE_READ, logger);
        eventManager.subscribe(EventType.FILE_CLOSED, logger);
        eventManager.subscribe(EventType.FILE_SEND, emailSender);
        eventManager.subscribe(EventType.FILE_SEND, logger);

        FileReader fileReader = new FileReader(eventManager);
        fileReader.openFile("file.txt");
        fileReader.readFile("file.txt");
        fileReader.sendFileContents();
        fileReader.closeFile("file.txt");

        eventManager.unsubscribe(EventType.FILE_READ, logger);
        fileReader.readFile("file.txt");
    }
}
