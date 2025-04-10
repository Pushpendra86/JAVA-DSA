package Leetcode;
//all even and odd numbers are Separate

public class OddEvenSeparator {
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

    //sorting method
    static void sortArrayByParity(int[] arr){
        int left = 0, right = arr.length-1;
        while (left < right){
            if (arr[left] % 2 == 1 && arr[right] % 2==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] %2==0){
                left++;
            }
            if (arr[right] %2 ==1){
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        printArray(arr);
        sortArrayByParity(arr);
        printArray(arr);

    }
}
