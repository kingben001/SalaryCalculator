package com.company;

import java.util.Scanner;

public class WeeklySalaryCalculator {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many hours have you worked?");
        double hours = keyboard.nextDouble();
        System.out.println("What is your hourly rate?");
        double payrate = keyboard.nextDouble();


        double salary = 0;
        if (hours>40){
            salary = salary +500;
        }
        salary = hours * payrate ;

        System.out.println("Your salary is: " + salary);

    }
}
