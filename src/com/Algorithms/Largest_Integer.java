package com.Algorithms;

public class Largest_Integer {

    public static void main(String[] args) {
        //this will create an array with a size of 7 (only put 7 elements)
        int[] array = new int[7];
        array[0] = 9999;
        array[1] = 300;
        array[2] = 5;
        array[3] = 3;
        array[4] = 2;
        array[5] = 9;
        array[6] = 3000;
        //most starts with first element
        int most = array[0];

        for(int i = 0; i < array.length; i++)
        {
            //if it reaches the last element it leaves the loop
            if(i == array.length - 1)
            {
                break;
            }
            else
            {
                //if the most value element less than the value of the next element
                if(most < array[i + 1])
                {
                    //most will now be assigned the new element
                    most = array[i + 1];
                }
                else
                {
                    //skip the index
                    continue;
                }
            }
        }
        //prints the value of the final most element
        System.out.println(most);
    }
}
