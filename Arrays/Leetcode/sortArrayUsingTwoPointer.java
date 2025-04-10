package Leetcode;

public class sortArrayUsingTwoPointer {
    //Method for swapping
    static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    //print arrays
    static void printArray(int[]arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    static void reverse(int[] arr){
        int i = 0, j = arr.length;
        while (i < j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    static int[] sortSquare(int[] arr){
        int left = 0, right =arr.length-1, k =arr.length-1; // k is for filling the elements in the array
        int[] ans = new int[arr.length]; //creating new array
        while (left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k--] = arr[left] * arr[left];
                left++;
            }else {
                ans[k--] = arr[right] * arr[right];
                right--;
            }
        } return ans;
    }

    public static void main(String[] args) {
        int[] arr = {-10,-5,-4,1,2,9};
        int[] ans =sortSquare(arr);
        printArray(ans);
    }
}
