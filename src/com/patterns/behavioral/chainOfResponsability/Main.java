package com.patterns.behavioral.chainOfResponsability;

import com.patterns.behavioral.chainOfResponsability.model.Chain;

import static com.patterns.behavioral.chainOfResponsability.handler.ChainHandler.createChain;

// Running the Sender class as application.
public class Main {

    public static void main(String[] args) {

        Chain chain = createChain();

        chain.message("level 3", Chain.Three);

        chain.message("level 2", Chain.Two);

        chain.message("level 1", Chain.One);
    }
}
