package Leetcode;

public class TargetSum {
    static int addTargetSum(int[] arr, int target){
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] + arr[j] == target){
                    sum++;
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arrays = {4,6,3,5,8,2};
        System.out.println(addTargetSum(arrays,7 ));


    }
}
