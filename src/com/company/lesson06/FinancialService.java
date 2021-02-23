package com.company.lesson06;

public class FinancialService
{
    public void pay(Salary salary) {
        System.out.println("Should be paid : " + salary.calculateSalary());
    }
}
