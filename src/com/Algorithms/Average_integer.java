package com.Algorithms;

public class Average_integer {

    public static void main(String[] args) {
        //this will create an array with a size of 7 (only put 7 elements)
        int[] array = new int[7];
        array[0] = 1;
        array[1] = 1;
        array[2] = 1;
        array[3] = 1;
        array[4] = 1;
        array[5] = 1;
        array[6] = 1;
        //initialize the sum variable to 0
        int sum = 0;
        //loops through the array
        for(int i = 0; i < array.length; i++)
        {
            //sum is added with each element
            sum = sum + array[i];
        }
        System.out.println(sum / array.length);
    }
}
