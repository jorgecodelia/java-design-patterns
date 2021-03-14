package com.patterns.behavioral.observer.observer;

import com.patterns.behavioral.observer.subject.Subject;

public interface Observer {
    public void update(Subject s);
}
