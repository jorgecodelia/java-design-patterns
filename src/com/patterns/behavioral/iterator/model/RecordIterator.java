package com.patterns.behavioral.iterator.model;

public class RecordIterator implements IIterator{
    private final String[] recordArray = {"first","second","third","fourth","fifth"};
    private int index;

    public boolean hasNext(){
        return (index < recordArray.length);
    }

    public Object next(){
        if (this.hasNext()) {
            return recordArray[index++];
        } else {
            return null;
        }
    }
}
