package com.patterns.behavioral.interpreter.interpreter;

import com.patterns.behavioral.interpreter.expression.AndExpression;
import com.patterns.behavioral.interpreter.expression.Expression;
import com.patterns.behavioral.interpreter.expression.OrExpression;
import com.patterns.behavioral.interpreter.expression.TerminalExpression;

public class PatternInterpreter {
    public static Expression getMaleExpression(){
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    //Rule: Julie is a married women
    public static Expression getMarriedWomanExpression(){
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
