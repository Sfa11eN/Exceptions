package ru.skypro.Calculatorapp.service;

import org.springframework.stereotype.Service;

@Service

public class CalculaterServiceImpl  implements ru.skypro.Calculatorapp.service.CalculatorService {
    @Override
    public int sum(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public float divide(int num1, int num2) {
        return num1/num2;
    }
}
