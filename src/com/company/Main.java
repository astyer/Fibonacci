package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Input a number to see if it's a fibonacci number");
        int num = input.nextInt();

        solver.nums[0] = 1;
        solver.nums[1] = 1;

        if(num == 0)
        {
            System.out.println(num + " is a fibonacci number.");
        }

        else if(solver.fibonacci(3, num, 2) == 1)
        {
            System.out.print(num + " is a fibonacci number. Here are the numbers leading up to it: 0 ");
            for(int i = 0; i < solver.nums.length; i++)
            {
                if(solver.nums[i] != 0)
                {
                    System.out.print(solver.nums[i] + " ");
                }
            }
        }

        else
        {
            System.out.println(num + " is not a fibonacci number.");
        }

    }
}
