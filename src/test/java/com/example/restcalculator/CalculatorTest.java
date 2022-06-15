package com.example.restcalculator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void sumTest1(){
        //Arrange
        int a = 2;
        int b = 5;

        int expectedResult = 7;

        //Act
        int result = calculator.sum(a,b);

        //Assert
        assertEquals(expectedResult, result);
    }


}
