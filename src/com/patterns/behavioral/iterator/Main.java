package com.patterns.behavioral.iterator;

import com.patterns.behavioral.iterator.model.IIterator;
import static com.patterns.behavioral.iterator.model.RecordCollection.createIterator;

public class Main {
    public static void main(String[] args) {
        IIterator iterator = createIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
