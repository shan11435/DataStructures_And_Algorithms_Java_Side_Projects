package com.Algorithms;

public class Factorial_Algorithm_right_to_left {
    public static void main(String[] args)
    {
       System.out.println(Factorial(10));
    }

    public static int Factorial(int num)
    {
        //if the num being used in the argument is 0
        if(num == 0)
        {
            return 1;
        }

        //initalize the variable
        int factorial = 1;

        //loops through the num value
        for(int i = num; i <= num; i--)
        {
            //if the next iteration is 0
            if(i == 0)
            {
                break;
            }
            //continue with the loop
            else
            {
                //multiply factorial with each iteration
                //the factorial will the be updated for the next iteration
                factorial = factorial * i;
            }
        }
        //the method should print out the factorial value
        return factorial;
    }
}
