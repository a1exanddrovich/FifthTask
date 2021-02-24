package com.epam.task.fifth.interpreter;

public class Calculator {

    public int perform(int firstNumber, int secondNumber, Operation operation) {
        return operation.perform(firstNumber, secondNumber);
    }

}
