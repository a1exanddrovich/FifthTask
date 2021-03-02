package com.epam.task.fifth.interpreter;

public class TerminalExpressionMultiply extends AbstractExpression {

    @Override
    public void interpret(Context context) {
        context.pushValue(context.popValue() * context.popValue());
    }

}
