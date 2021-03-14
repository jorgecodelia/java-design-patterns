package com.patterns.behavioral.interpreter;

import com.patterns.behavioral.interpreter.expression.Expression;

import static com.patterns.behavioral.interpreter.interpreter.PatternInterpreter.getMaleExpression;
import static com.patterns.behavioral.interpreter.interpreter.PatternInterpreter.getMarriedWomanExpression;

public class Main {
    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }
}
