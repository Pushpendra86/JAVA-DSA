package Leetcode;

public class UniqueValue {
    static int findValue(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i] > 0){
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,5};
        System.out.println(findValue(arr));
    }
}
