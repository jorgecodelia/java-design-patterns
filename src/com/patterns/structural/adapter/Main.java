package com.patterns.structural.adapter;

import com.patterns.structural.adapter.adapter.AppleAdapter;
import com.patterns.structural.adapter.model.Apple;
import com.patterns.structural.adapter.model.Orange;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();

        apple.getAColor("green");

        Orange orange = new Orange();

        AppleAdapter aa = new AppleAdapter(orange);
        aa.getAColor("red");
    }
}
