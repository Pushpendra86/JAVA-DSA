
//Arrays passed as a reference to the function not as a copy because java
// working on pass by value not pass by reference.
public class ArraysReferences {
    static void changingArrays(int arr[]){
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = 0;
        }
    }
    public static void main(String[] args) {
        int arr [] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arrayInput.printArray(arr);
        //copying arrays
        int arr_2[] = arr;
        changingArrays(arr_2);
        arrayInput.printArray(arr_2);

        System.out.println("printing arr_1 after changing");
        arrayInput.printArray(arr);

        System.out.println("printing arr_2 after changing");
        arrayInput.printArray(arr_2);
    }
}
