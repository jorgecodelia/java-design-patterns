package com.patterns.behavioral.iterator.model;

public class RecordCollection {

    public static IIterator createIterator(){
        return new RecordIterator();
    }
}
