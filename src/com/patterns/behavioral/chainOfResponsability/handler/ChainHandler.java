package com.patterns.behavioral.chainOfResponsability.handler;

import com.patterns.behavioral.chainOfResponsability.model.ReceiverA;
import com.patterns.behavioral.chainOfResponsability.model.ReceiverB;
import com.patterns.behavioral.chainOfResponsability.model.ReceiverC;
import com.patterns.behavioral.chainOfResponsability.model.Chain;

public class ChainHandler {
    public static Chain createChain() {
        // Build the chain of responsibility

        Chain chain1 = new ReceiverA(Chain.Three);

        Chain chain2 = new ReceiverB(Chain.Two);
        chain1.setNext(chain2);

        Chain chain3 = new ReceiverC(Chain.One);
        chain2.setNext(chain3);

        return chain1;
    }
}
