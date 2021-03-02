package com.epam.task.fifth.interpreter;

public class TerminalExpressionDivide extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        context.pushValue(context.popValue() / context.popValue());
    }

}
