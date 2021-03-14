package com.patterns.behavioral.observer.subject;

import com.patterns.behavioral.observer.observer.Observer;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyAllObservers();
}
