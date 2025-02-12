package Leetcode;

public class ReverseArray {
    static int[] reverse(int[] arr){
        int[] ary = new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            ary[i] = arr[i];
        }
        return reverse(ary);
    }
    public static void main (String args[]){
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println();
    }
}
