package Leetcode;

import java.util.Arrays;

public class SmallestAndLargest {
    static int[] smallestAndLargest(int[] arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]}; //new memory space is allocated
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {3,52,4,7,8,8,5,3,2,6,6,8};
        int [] ans = smallestAndLargest(arr);
        System.out.println("smallest "+ans[0]);
        System.out.println("largest "+ans[1]);
    }
}
