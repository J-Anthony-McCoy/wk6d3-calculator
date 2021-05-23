package com.company;

import java.util.Scanner;

public class Calculator {

    public static void Calculations(){
//        Scanner for user input
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to this simple calculator coded in Java!");

//        Asking user to input both numbers for arithmetic
        System.out.println("What is the first number?");
        int input1 = input.nextInt();
        input.nextLine();
        System.out.println("What is the second number?");
        int input2 = input.nextInt();
        input.nextLine();

        System.out.println(input1 + " " + input2);


    }
}
