import java.util.Arrays;

public class PrefixSum {
    private  static  int[] makePrefixSumArray(int[] arr){
        int n = arr.length; //took a variable
        int[] prefix = new int[n]; //allocating extra memory space
        prefix[0] = arr[0];  //initially put zero values in zero index
        for (int i = 1; i < n ; i++) {
//            here i-1 means one step back
//            prefix[1] = prefix[0] + arr[1]  <-- this is an understanding
            prefix[i] = prefix[i-1] + arr[i];
            System.out.println(prefix[i]);
        }
        return prefix;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int [] ans = makePrefixSumArray(arr);
//        System.out.println(Arrays.toString(ans));
    }
}
