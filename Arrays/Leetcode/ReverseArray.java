package Leetcode;

import java.util.Arrays;

public class ReverseArray {
    // using new Array
    static int[] reverse(int[] arr){
        int[] ary = new int[arr.length];
        int j = 0;
        //travarse original array in reverse direction
        for (int i = arr.length-1; i >=0; i--) {
            ary[j++] = arr[i];
        }
        return ary;
    }
    //using existing array or in-placing reverse;
    static void reverseArr(int[] arr){
        int end = arr.length-1;
        int start = 0;
        while (start<end){
            //swapping
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }
    public static void main (String args[]){
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
//        int[] ans = reverse(arr);
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));



    }
}
