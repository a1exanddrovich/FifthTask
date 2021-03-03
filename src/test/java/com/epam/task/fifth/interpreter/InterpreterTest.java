package com.epam.task.fifth.interpreter;

import org.junit.Assert;
import org.junit.Test;

public class InterpreterTest {

    private final Interpreter interpreter = new Interpreter();

    @Test
    public void testShouldCalculateExpression() {

        //given
        String expression = "2_2_3_4_+_*_/";
        interpreter.setListExpression(expression);

        //when
        int actual = interpreter.calculate();

        //then
        Assert.assertEquals(7, actual);

    }

}
