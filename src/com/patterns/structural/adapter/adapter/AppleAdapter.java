package com.patterns.structural.adapter.adapter;

import com.patterns.structural.adapter.model.Apple;
import com.patterns.structural.adapter.model.Orange;

public class AppleAdapter extends Apple {
    private Orange orange;

    public AppleAdapter(Orange orange) {
        this.orange = orange;
    }

    public void getAColor(String str) {
        orange.getOColor(str);
    }
}
