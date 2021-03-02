package com.epam.task.fifth.interpreter;

import java.util.ArrayList;
import java.util.Scanner;

public class Interpreter {

    private ArrayList<AbstractExpression> listExpression;

    public void setListExpression(String expression) {
        this.listExpression = new ArrayList<>();
        parse(expression);
    }

    private void parse(String expression) {
        for(String lexeme : expression.split("_")) {
            if(lexeme.isEmpty()) {
                continue;
            }
            char symbol = lexeme.charAt(0);
            switch (symbol) {
                case '+':
                    listExpression.add(new TerminalExpressionSum());
                    break;
                case '-':
                    listExpression.add(new TerminalExpressionSubtract());
                    break;
                case '*':
                    listExpression.add(new TerminalExpressionMultiply());
                    break;
                case '/':
                    listExpression.add(new TerminalExpressionDivide());
                    break;
                default:
                    Scanner scanner = new Scanner(lexeme);
                    if(scanner.hasNextInt()) {
                        listExpression.add(new NonTerminalExpression(scanner.nextInt()));
                    }
            }
        }
    }

    public int calculate() {
        Context context = new Context();
        for(AbstractExpression terminal : listExpression) {
            terminal.interpret(context);
        }
        return context.popValue();
    }

}
