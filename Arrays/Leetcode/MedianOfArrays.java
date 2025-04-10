package Leetcode;

import java.util.Arrays;

public class MedianOfArrays {
        //function
    public static double findMedianSortedArrays(int[] num1, int[] num2) {
        // Create a new array
        int[] mergedArray = new int[num1.length + num2.length];

        // Copy elements of num1 to mergedArray
        System.arraycopy(num1, 0, mergedArray, 0, num1.length);

        // Copy elements of num2 to mergedArray
        System.arraycopy(num2, 0, mergedArray, num1.length, num2.length);
        Arrays.sort(mergedArray);
        // Find the median
        int n = mergedArray.length;
        if (n % 2 == 1) {
            // Odd length: median is the middle element
            return mergedArray[n / 2];
        } else {
            // Even length: median is the average of the two middle elements
            double median = (mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2.0;
            return median;
        }
    }

    public static void main (String args[]) {
        int[] num1 = {1,5,3};
        int[] num2 = {2};
        // Call the function and print the result
        double result = findMedianSortedArrays(num1, num2);
        System.out.println(result);  // Output: 2.5
    }
}
