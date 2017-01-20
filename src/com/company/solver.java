package com.company;

public class solver {

    public static int last = 2;
    public static int lastLast = 2;
    public static int[] nums = new int[1000];
    public static int fibonacci(int current, int n, int i)
    {
        if(n == 1)
        {
            return 1;
        }

        else if(current == n)
        {
            return 1;
        }

        else if(current > n)
        {
            return 0;
        }
        else
        {
            nums[i] = current;
            int diff = current - last;
            lastLast = last;
            last += diff;
            return fibonacci(current + lastLast, n, i+1);
        }

    }

}
