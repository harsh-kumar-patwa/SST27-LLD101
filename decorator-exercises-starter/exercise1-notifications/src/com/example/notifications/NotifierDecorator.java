package com.example.notifications;

public class NotifierDecorator implements Notifier {

    private Notifier notifier;

    public NotifierDecorator(Notifier notifier) {
        this.notifier = notifier;
    }
    
    @Override
    public void notify(String text) {
        notifier.notify(text);
    }
    
    
}
