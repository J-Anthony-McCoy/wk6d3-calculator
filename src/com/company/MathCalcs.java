package com.company;

import java.util.Scanner;

public class MathCalcs {
//    This class holds all math methods for calculator

//    ADDITION
    public static void Add(){
        Scanner input = new Scanner(System.in);
        System.out.println("You chose addition. What is the first number?");
        int input1 = input.nextInt();
        System.out.println("What is your second number?");
        int input2 = input.nextInt();
        System.out.println("Solution: " + (input1+input2));
    }

//    SUBTRACTION
    public static void Subtract(){
        Scanner input = new Scanner(System.in);
        System.out.println("You chose subtraction. What is the first number?");
        int input1 = input.nextInt();
        System.out.println("What is your second number? This number will be subtracted from the first.");
        int input2 = input.nextInt();
        System.out.println("Solution: " + (input1-input2));
    }

//    MULTIPLICATION
    public static void Multiply(){
        Scanner input = new Scanner(System.in);
        System.out.println("You chose multiplication. What is the first number?");
        int input1 = input.nextInt();
        System.out.println("What is the second number?");
        int input2 = input.nextInt();
        System.out.println("Solution: " + (input1 * input2));
    }

//    DIVISION
    public static void Divide(){
        Scanner input = new Scanner(System.in);
        System.out.println("You chose division. What is the first number?");
        double input1 = input.nextInt();
        System.out.println("What is the second number? This number will be divided into the first.");
        double input2 = input.nextInt();
        System.out.println("Solution: " + (input1 / input2));
    }

//    SQUARE
    public static void Square(){
        Scanner input = new Scanner(System.in);
        System.out.println("You chose square. What is the number?");
        int input1 = input.nextInt();
        System.out.println("Solution: " + Math.pow(input1, 2));
    }

//    SQUARE ROOT
    public static void Root(){
        Scanner input = new Scanner(System.in);
        System.out.println("You chose square root. What is the number?");
        double input1 = input.nextInt();
        System.out.println("Solution: " + Math.sqrt(input1));
    }

//    SINE
    public static void Sine(){
        Scanner input = new Scanner(System.in);
        System.out.println("You chose sine. What is the number?");
        double input1 = input.nextInt();
        System.out.println("Solution: " + Math.sin(input1));
    }

//    COSINE
    public static void Cosine(){
        Scanner input = new Scanner(System.in);
        System.out.println("You chose cosine. What is the number?");
        double input1 = input.nextInt();
        System.out.println("Solution: " + Math.cos(input1));
    }

//    TANGENT
    public static void Tangent(){
        Scanner input = new Scanner(System.in);
        System.out.println("You chose tangent. What is the number?");
        double input1 = input.nextInt();
        System.out.println("Solution: " + Math.tan(input1));
    }
}
