package Leetcode;
public class FrequencyOfElement {
    static int checkFrequeny(int arr[], int key) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int arr[] = {1,5,3,4,5,6,7,5,5,5,7};
        int key = 5;
        System.out.println(checkFrequeny(arr,key));
    }
}

