package com.epam.task.fifth.component;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (!(o instanceof Expression)){
            return false;
        }
        Expression that = (Expression) o;
        return getExpression().equals(that.getExpression());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getExpression());
    }
}
