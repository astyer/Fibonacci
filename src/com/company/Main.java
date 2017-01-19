package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a number to see if it's a fibonacci number");
        int num = input.nextInt();

        solver.fibonacci(20, num);
        if(solver.found)
        {
            System.out.println(num + " is a fibonacci number.");
        }

    }
}
