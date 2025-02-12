package Leetcode;

//output [i,j]
public class TwoSum {
    static int[] twoSum(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] { };
    }
    public static void main( String args[]){
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(nums, target);
        if (result.length ==2){
            System.out.println("[" + result[0]+ ","+result[1]+"]");
        }else {
            System.out.println("no result found");
        }
    }
}
