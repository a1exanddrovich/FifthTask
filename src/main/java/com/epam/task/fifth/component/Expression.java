package com.epam.task.fifth.component;

public class Expression implements Component {

    private String expression = new String();

    public Expression(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return this.expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    @Override
    public int getCount() {
        return this.expression.length();
    }

}
