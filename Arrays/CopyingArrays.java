import java.util.Arrays;

public class CopyingArrays {
    public static void main(String[] args) {
        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arrayInput.printArray(arr);
        //copying arrays
//        int arr_2[] = arr.clone(); //copying method for deep-copy
        int arr_2[] = Arrays.copyOf(arr, arr.length);
        arrayInput.printArray(arr_2);

        //Another way
        int[] num1 = {1,3};
        int[] num2 = {2};
        // Create a new array large enough to hold both arrays
        int[] mergedArray = new int[num1.length + num2.length];
        // Copy elements of num1 to mergedArray
        System.arraycopy(num1, 0, mergedArray, 0, num1.length);
        // Copy elements of num2 to mergedArray
        System.arraycopy(num2, 0, mergedArray, num1.length, num2.length);
        System.out.println(Arrays.toString(mergedArray));
    }
}
