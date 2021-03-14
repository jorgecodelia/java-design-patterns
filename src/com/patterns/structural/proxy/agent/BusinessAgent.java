package com.patterns.structural.proxy.agent;

import com.patterns.structural.proxy.model.Britney;
import com.patterns.structural.proxy.model.CheatingWife;

public class BusinessAgent implements CheatingWife {
    private CheatingWife cheatingWife;

    public BusinessAgent() {
        this.cheatingWife = new Britney();
    }

    public BusinessAgent(CheatingWife cheatingWife) {
        this.cheatingWife = cheatingWife;
    }

    public void seduceMan() {
        this.cheatingWife.seduceMan();
    }

    public void happyWithMan() {
        this.cheatingWife.happyWithMan();
    }
}
