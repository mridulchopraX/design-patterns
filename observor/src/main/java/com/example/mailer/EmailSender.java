package com.example.mailer;

import com.example.event.Event;
import com.example.event.FileSendingEvent;
import com.example.event.listener.EventListener;

public class EmailSender implements EventListener {

    public void sendEmail(String to, String subject, String body) {
        System.out.println("<EmailSender> Sent mail to " + to + " with subject " + subject + " and body " + body);
    }

    @Override
    public void onEvent(Event event) {
        FileSendingEvent fileSendingEvent = (FileSendingEvent) event;
        String body = "Here are the file contents : " + fileSendingEvent.contents;
        sendEmail(fileSendingEvent.to, fileSendingEvent.subject, body);
    }
}
