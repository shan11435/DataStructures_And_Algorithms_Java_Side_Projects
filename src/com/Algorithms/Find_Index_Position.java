package com.Algorithms;

public class Find_Index_Position {
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

        //this assigns the index to -1
        int index = -1;
        for(int i = 0; i < array.length; i++)
        {
            //if there's element 5 in the array
            if(array[i] == 5)
            {
                //index = array index 2
                index = i;
                break;
            }
        }
        System.out.println("element 5 is index " + index);
    }
}
