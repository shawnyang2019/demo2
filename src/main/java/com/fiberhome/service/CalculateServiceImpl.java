package com.fiberhome.service;

public class CalculateServiceImpl  implements ICalculateService{
    @Override
    public int add(int a, int b) {
        return a +b;
    }

    @Override
    public int sub(int a, int b) {
        return a -b;
    }
}
