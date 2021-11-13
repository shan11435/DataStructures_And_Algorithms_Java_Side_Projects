package com.Algorithms;

public class Find_element_Position {
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

        //this will assign the element
        int element = 0;
        //this will assign the index
        int index = -1;
        for(int i = 0; i < array.length; i++)
        {
            //if there's an element 5 in the array
            if(array[i] == 9)
            {
                //variable element = 5
                element = array[i];
                //variable index = 2
                index = i;
                break;
            }
        }
        System.out.println("element in index " + index + " = "  + element);

    }
}
