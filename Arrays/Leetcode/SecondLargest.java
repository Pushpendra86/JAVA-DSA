package Leetcode;

public class SecondLargest {
    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
        static int findSecondMax(int[] arr){
            //for second max
            int max = findSecondMax(arr);
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == max) {
                    arr[i] = Integer.MIN_VALUE;
                }
            }
            int secondMax = findSecondMax(arr);
            return secondMax;
        }
    public static void main(String[] args) {
        int[] arr = {2,3,4,1,3,5,7,8,10};
        System.out.println(findSecondMax(arr));
    }
}
