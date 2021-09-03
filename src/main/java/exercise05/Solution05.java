package exercise05;
/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jacob Cordonero
 */

import java.util.Scanner;

public class Solution05 {
    public static void main(String[] args) {
        //prompt user for two numbers
        //store the numbers in a buffer string
        //convert the buffer to numeric values
        //store the values into two integers respectively
        //store the calculations in integers named for respective operations
        //Print the sum, difference, product, and quotient
        //using the respectively named integer values
        Scanner input = new Scanner(System.in);
        String buffer;
        System.out.print("What is the first number? ");
        buffer = input.nextLine();
        int n1 = Integer.parseInt(buffer);
        System.out.print("What is the second number? ");
        buffer = input.nextLine();
        int n2 = Integer.parseInt(buffer);
        //fancy math
        int add,sub,mult,div;
        add = n1 + n2;
        sub = n1 - n2;
        mult = n1 * n2;
        div = n1 / n2;

        System.out.println(n1 + " + " + n2 + " = " + (add));
        System.out.println(n1 + " - " + n2 + " = " + (sub));
        System.out.println(n1 + " * " + n2 + " = " + (mult));
        System.out.println(n1 + " / " + n2 + " = " + (div));
    }
}
