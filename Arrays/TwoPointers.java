import java.util.Arrays;

public class TwoPointers {
    //Two traversal
    static void sortsZerosAndOnes(int[] arr){
        int n = arr.length;
        int zeroes = 0;
        for (int i = 0; i <n ; i++) {
            if (arr[i] == 0){
                zeroes++;
            }
        }
        for (int i = 0; i <n ; i++) {
            if (i < zeroes){
                arr[i] = 0;
            }else {
                arr[i] = 1;
            }
        }
    }
    //Method for swapping
    static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
    //Optimized approach
    static void sortzerosANDonce (int[] arr){
        int left =0, right = arr.length-1;
        while (left<right){
            if (arr[left] == 1 && arr[right] == 0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] ==0){
                left++;
            }
            if (arr[right] ==1){
                right--;
            }
        }
    }
    public static void main (String args[]){
        int[] arr= {1,1,1,1,1,0,0,0,0,0};
        System.out.println("Before sorting : "+ Arrays.toString(arr));
//        sortsZerosAndOnes(arr);
        sortzerosANDonce(arr);
        System.out.println("After sorting : "+ Arrays.toString(arr));

    }

}
