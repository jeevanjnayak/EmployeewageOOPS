package com.company.EmployeewageOOPS;

import java.util.Scanner;

public class EmployeeWageOOPS {

    public int dayPresent = 0, monthlyWage = 0, totalHour = 0;

    public void MonthlyWage() {
        int Is_Present = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter how many hours worked: ");
        int hours = input.nextInt();

        for (int i = 1; i <= 31; i++) {
            double EmpStatus = Math.floor(Math.random() * 10) % 2;

            if (EmpStatus == Is_Present) {

                if (dayPresent < 20 && totalHour < 100) {
                    dayPresent += 1;
                    totalHour += hours;
                }
            }
        }
    }

    public void Printing() {
        System.out.println("working day " + dayPresent);
        System.out.println("total hour worked " + totalHour);
        monthlyWage = totalHour * 20;
        System.out.println("monthly salary is " + monthlyWage);

    }

}
class Calling {

    public static void main(String[] args){

        EmployeeWageOOPS Wage = new EmployeeWageOOPS();
        Wage.MonthlyWage();
        Wage.Printing();

    }
}