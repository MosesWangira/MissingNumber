package com.company;

import java.util.*;

/**
 * program returning missing integer in array
 */

public class Main {
    public static void main(String[] args) {
        int[] arrayToFindMissingNumber = {3, 5, 4, 2};

        /**
         * getting size of array
         * use array.length + 1 since the missing number is always 1
         * */
        int size = arrayToFindMissingNumber.length + 1;
        System.out.println("Size of array : " + size);

        /**
         * Finding the missing number
         * */
        int sumOfAll = (size * (size + 1)) / 2;
        int sumOfArray = 0;
        for (int i = 0; i <= size - 2; i++) {
            sumOfArray = sumOfArray + arrayToFindMissingNumber[ i ];
        }
        int missingNumber = sumOfAll - sumOfArray;
        System.out.println("Missing number is: " + missingNumber);


        /**
         * Increase size of array to include the missing number found
         * */
        int[] newArray = new int[ arrayToFindMissingNumber.length + 1 ];

        /**
         * copy contents of original array to new array
         * */
        System.arraycopy(arrayToFindMissingNumber, 0, newArray, 0, arrayToFindMissingNumber.length);
        arrayToFindMissingNumber = newArray;

        /**
         * Array starts at 0 so reduce the array size by 1 to get the last index and
         * assign it the missing number
         * */
        arrayToFindMissingNumber[ size - 1 ] = missingNumber;

        /**
         * print out array contents
         * */
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int itemFromArray = arrayToFindMissingNumber[ i ];
            arrayList.add(itemFromArray);
        }

        System.out.println("Array with missing number as arrayList : " + arrayList);
    }

}

//copy contents of original array to new array
//for(int i=0;i<arrayToFindMissingNumber.length;i++){
//    newArray[i]=arrayToFindMissingNumber[i];
//   }