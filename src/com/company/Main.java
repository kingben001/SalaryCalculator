package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many hours have you worked?");
        double hours = keyboard.nextDouble();
        System.out.println("What is your hourly rate?");
        double payrate = keyboard.nextDouble();

       double salary = hours * payrate ;
        double beforeBonus = salary;
        if (hours>40){
            salary = salary +500;
            beforeBonus = salary -500;
        }


        System.out.println("Your salary is: " +beforeBonus +
                "\nYour total after bonus is: " + salary  );

    }
}
