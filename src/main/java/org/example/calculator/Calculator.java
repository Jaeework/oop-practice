package org.example.calculator;

import org.example.calculator.calculator.*;

import java.util.List;

public class Calculator {

    private static final List<NewArithmeticOperator> arithmeticOperator = List.of(new AdditionOperator(), new SubtractionOperator(), new MultiplicationOperator(), new DivisionOperator());

    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2) {

        // 인터페이스로 리팩토링
        return arithmeticOperator.stream()
                .filter(arithmeticOperator -> arithmeticOperator.supports(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculate(operand1, operand2))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다."));

        // enum으로 리팩토링
        //return ArithmeticOperator.calculate(operand1, operand2, operator);

        /*
        리팩토링 전
        if("+".equals(operator)) {
            return operand1 + operand2;
        } else if("-".equals(operator)) {
            return operand1 - operand2;
        } else if("*".equals(operator)) {
            return operand1 * operand2;
        } else if("/".equals(operator)) {
            return  operand1 / operand2;
        }
        return 0;

         */
    }
}
