package com.Algorithms;

public class Factorial_Algorithm_Array_Right_to_Left {

    //this is a recursion
    public static void main(String[] args) {
        //this will create an array with a size of 7 (only put 7 elements)
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //initialize the sum variable to 0
        int product = 1;
        //loops through the array
        for(int i = array.length - 1; i < array.length; i--)
        {
            //if the next iteration is -1 you break out of the loop
            if(i == -1)
            {
                break;
            }
            //but if it doesn't equal -1 continue with the loop
            else
            {
                //product is multiplied with each element, it's multiplied from right to left starting with last element in array
                product = product * array[i];
            }

        }
        System.out.println(product);
    }
}
