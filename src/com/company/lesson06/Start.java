package com.company.lesson06;

public class Start
{
    public static void main(String[] args)
    {
        Salary fixedSalaryEmployee1 = new FixedSalaryEmployee("Mark", "Mark", 44, 12240);
        Salary fixedSalaryEmployee2 = new FixedSalaryEmployee("Mark", "Mark", 33, 1890);
        Salary hourlySalaryEmployee1 = new HourlySalaryEmployee("Mark", "Mark", 23, 130, 80);

        FinancialService finService = new FinancialService();
        Salary[] employees = {fixedSalaryEmployee1, fixedSalaryEmployee2, hourlySalaryEmployee1};

        for (Salary employee : employees) {
            finService.pay(employee);
        }

        ((HourlySalaryEmployee) hourlySalaryEmployee1).getHours();


        System.out.println("wegerwerbwerbwerberwqbwerbwerq " + employees.length +
            " webbwebwerasbwreqbweqbrvewrqbv" +
            "ebrbrwebwrebewqbewrabweb" +
            "ebrerbwbwebwerbwerbewberberb");
    }
}
