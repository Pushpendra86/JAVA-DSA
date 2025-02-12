package Leetcode;

public class CheckSortedOrNot {
    static boolean isSorted(int arr[]){
        boolean check = true;
        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] < arr[i-1]) {
                check = false;
                break;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        int [] arr = {2,4,2,4,5,654,5,7,56,8};
        System.out.println(isSorted(arr));
    }
}
