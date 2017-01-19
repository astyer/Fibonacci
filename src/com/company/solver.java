package com.company;

public class solver {

    public solver()
    {

    }

    public static int fibonacci(int n, int f)
    {
        if(n == 0)
        {
            return 0;
        }

        else if(n == 1)
        {
            return 1;
        }

        else
        {
            return fibonacci(n - 1, f) + fibonacci(n - 2, f);
        }

    }

    public static boolean found = false;
    public static void test()
    {
        found = true;
    }

}
