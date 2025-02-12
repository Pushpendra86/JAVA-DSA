package Leetcode;

import java.util.Arrays;

public class Max_Min {
    //For maximum
    static int maxValue(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) { //outer loop
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    // for minimum
    static int minValue(int[]arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) { //outer loop
            if (arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main (String args[]){
        int[] arr= {55,33,15,10,18};
        Arrays.sort(arr); //arrays need to be sort
        System.out.println(maxValue(arr));
//        System.out.println(minValue(arr));
    }
}
