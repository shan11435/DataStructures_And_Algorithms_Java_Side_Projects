package com.Algorithms;

public class Selection_sort_greatest_to_least {

    public static void main(String[] args) {
        //these are the elements for the intArray array
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        //this will loop starting from index 6 downward, this will set the lastunsorted index to decrement by 1 everytime it iterates
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--)
        {
            //this will set the least to intArray[0]
            int least = 0;

            //this will loop starting from index 1 upward to lastunsorted index
            for(int i = 1; i <= lastUnsortedIndex; i++)
            {
                //if the index is greater than the least variable element
                if(intArray[i] < intArray[least])
                {
                    //least variable element will be set to the index
                    least = i;
                }
            }

            //now that the least element has been found, it will be swapped with the last element of the unsortedindexc element
            swap(intArray, least, lastUnsortedIndex);

        }

        //this will loop through the new sorted array
        for(int i = 0; i < intArray.length; i++)
        {
            System.out.println(intArray[i]);
        }
    }

    //i and j are the elements that we are comparing to see if they shou;d be swapped in the array
    public static void swap(int[] array, int i, int j)
    {
        if(i == j)
        {
            //do nothing
            return;
        }
        //temp will be assigned the element in position i
        int temp = array[i];
        //the element in position i will now be assigned the element in position j
        array[i] = array[j];
        //the element in position j will be assigned the temp variable
        array[j] = temp;
    }
}
