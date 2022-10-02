package org.example;

import org.example.Coin.ILS;
import org.example.Coin.USD;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Welcome to Bengo Currency convertor!");
        Screen1();

    }
//Introduction screen
    public static void Screen1() {
        //First answer from user will be ans1:
        int ans1 = 3;
        //Loop for conversion type selection
        while (ans1 == 3) {
            try {
                System.out.println("Please select conversion type:");
                System.out.println(" For Shekel->Dollar insert 1. For dollar->shekel insert 2");
                Scanner sc = new Scanner(System.in);
                ans1 = sc.nextInt();

                //this is the condition for which calculation screen to enter
                if (ans1 == 1) {
                    Screen2_S_to_D();
                } else if (ans1 == 2) {
                    Screen2_D_to_S();
                } else {
                    System.out.println("Wrong input. please enter 1 or 2.");
                    ans1 = 3;
                }

            } catch (InputMismatchException Q1) {
                System.out.println("Oops, this field is only for numbers. Please insert 1 Or 2. Let's try again!");
                ans1 = 3;
            }
        }
    }

    public static void Screen2_S_to_D() {
        //second answer from user will be ans2:
        double ans2 = 0;
        while (ans2 == 0) {
            try {
                System.out.println("Please insert your amount for conversion ");
                Scanner sc2 = new Scanner(System.in);
                ans2 = sc2.nextDouble();
                USD myUSD = new USD();
                double result = myUSD.calculate(ans2);
                System.out.println("The result for your conversion is :" + result);
                Screen3();
            } catch (InputMismatchException q2) {
                System.out.println("Please insert a sum for conversion (Use only numbers)");
                ans2 = 0;
            }
        }
    }

    public static void Screen2_D_to_S() {
        //second answer from user will be ans2:
        double ans2 = 0;
        while (ans2 == 0) {
            try {
                System.out.println("Please insert your amount for conversion ");
                Scanner sc2 = new Scanner(System.in);
                ans2 = sc2.nextDouble();
                ILS myILS = new ILS();
                double result = myILS.calculate(ans2);
                System.out.println("The result for your conversion is :" + result);
                Screen3();
            } catch (InputMismatchException q2) {
                System.out.println("Please insert a sum for conversion (Use only numbers)");
                ans2 = 0;
            }
        }
    }

    public static void Screen3() {
        String ans3 = "X";

        System.out.println("Thank you for using Bengo convertor!");
        System.out.println("Would you like to preform another conversion?");
        System.out.println("If yes - enter Y. If not, enter N.");

        while (ans3=="X"){
        try {
            Scanner sc3 = new Scanner(System.in);
            ans3 = sc3.next();
            if (ans3.equals("Y")) {
                System.out.println("Alright, let's go!");
                Screen1();
            } else if (ans3.equals("N")) {
                Screen4();
            } else {
                System.out.println("Please enter Y for running another conversion, and N for exiting convertor.");
                ans3="X";
            }
        }
        catch (InputMismatchException q3){
            System.out.println("Please enter Y for running another conversion, and N for exiting convertor.");
            ans3="X";
        }

        }
    }
    public static void Screen4(){
        //Here should be printed arraylist with all conversion results.
        System.out.println("Thank you and see you next time! Goodbye!");
    }
}