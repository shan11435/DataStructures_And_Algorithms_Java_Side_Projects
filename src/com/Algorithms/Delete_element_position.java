package com.Algorithms;
//work on this
//delete an element in the array
public class Delete_element_position {
    public static void main(String[] args)
    {
        //this will create an array with a size of 7 (only put 7 elements)
        int[] array = new int[7];
        array[0] = 9999;
        array[1] = 300;
        array[2] = 5;
        array[3] = 3;
        array[4] = 2;
        array[5] = 9;
        array[6] = 3000;

        int index = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == 5)
            {
                //this is causing error
                //array[i] = Integer.parseInt(null);
                index = array[i];
                break;
            }
        }
        System.out.println("hello");

    }
}
