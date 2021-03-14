package com.patterns.structural.proxy;

import com.patterns.structural.proxy.agent.BusinessAgent;

// see? it looks that agent/proxy is doing
public class Mike {
    public static void main(String[] args) {
        BusinessAgent businessAgent = new BusinessAgent();
        businessAgent.seduceMan();
        businessAgent.happyWithMan();
    }
}
