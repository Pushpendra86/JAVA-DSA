import java.util.Scanner;

public class arrayInput {
    public static void printArray(int arr[]){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements here :");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = input.nextInt();
        }
        printArray(arr);
        // shallow copying arrays
        int[] arr_2 = arr;
        System.out.println("arrays after copying");
        printArray(arr_2);
    }

}
