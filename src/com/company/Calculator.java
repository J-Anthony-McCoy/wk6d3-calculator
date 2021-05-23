package com.company;

import java.util.Scanner;

public class Calculator {

    public static void Calculations(){
//        Scanner for user input
        Scanner input = new Scanner(System.in);

        System.out.println("** Welcome to this simple calculator coded in Java! **");

//        Asking user what type of math they want
        System.out.println("\nWhat type of math do you want applied to these numbers?\nChoose add, subtract, multiply, division, square, square root, sine, cosine, or tangent.");
        String math = input.nextLine();

//        ADD
        if(math.equals("add")){
            MathCalcs.Add();
            return;
        }

//        SUBTRACT
        if(math.equals("subtract")){
            MathCalcs.Subtract();
            return;
        }

//        MULTIPLY
        if(math.equals("multiply")){
            MathCalcs.Multiply();
            return;
        }

//        DIVIDE
        if(math.equals("division")){
            MathCalcs.Divide();
            return;
        }

//        SQUARE
        if(math.equals("square")){
            MathCalcs.Square();
            return;
        }

//        SQUARE ROOT
        if(math.equals("square root")){
            MathCalcs.Root();
            return;
        }

//        SINE
        if(math.equals("sine")){
            MathCalcs.Sine();
            return;
        }

//        COSINE
        if(math.equals("cosine")){
            MathCalcs.Cosine();
            return;
        }

//        TANGENT
        if(math.equals("tangent")){
            MathCalcs.Tangent();
            return;
        }

//        WRONG INPUT BY USER
        else{
            System.out.println("Sorry, you entered an invalid answer. Try again.");
            Calculator.Calculations();
        }

    }


}
