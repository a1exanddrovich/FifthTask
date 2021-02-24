package com.epam.task.fifth.interpreter;

public class Performer {

    Calculator calculator = new Calculator();

    public int calculate(Context context, char c) {
        switch (c) {
            case '+':
                Operation additionOperation = (firstNumber, secondNumber) -> {
                    return (firstNumber + secondNumber);
                };
                return calculator.perform(context.popValue(), context.popValue(), additionOperation);

            case '-':
                Operation subtractOperation = (firstNumber, secondNumber) -> {
                    return firstNumber - secondNumber;
                };
                return calculator.perform(context.popValue(), context.popValue(), subtractOperation);

            case '*':
                Operation multiplyOperation = (firstNumber, secondNumber) -> {
                    return firstNumber * secondNumber;
                };
                return calculator.perform(context.popValue(), context.popValue(), multiplyOperation);

            case '/':
                Operation divisionOperation = (firstNumber, secondNumber) -> {
                    return firstNumber / secondNumber;
                };
                return calculator.perform(context.popValue(), context.popValue(), divisionOperation);

            default:
                System.out.println("Not appropriate operation given...");
        }
        return 1;
    }

}
