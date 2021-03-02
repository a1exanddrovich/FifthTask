package com.epam.task.fifth.interpreter;

import com.epam.task.fifth.component.Component;
import com.epam.task.fifth.component.Composite;
import com.epam.task.fifth.component.Expression;

import java.util.List;

public class Calculator {

    private Interpreter interpreter = new Interpreter();

    public void calculateExpressions(Component text) {
        List<Component> paragraphs = ((Composite) text).getComponents();
        for (Component paragraph : paragraphs) {
            List<Component> sentences = ((Composite) paragraph).getComponents();
            for (Component sentence : sentences) {
                List<Component> lexemes = ((Composite) sentence).getComponents();
                for(Component lexeme : lexemes) {
                    if (lexeme instanceof Expression) {
                        interpreter.setListExpression((((Expression) lexeme).getExpression()));
                        ((Expression) lexeme).setExpression(String.valueOf(interpreter.calculate()));
                    }
                }
            }
        }
    }

}
