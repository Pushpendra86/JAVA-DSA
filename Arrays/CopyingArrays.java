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
    }
}
