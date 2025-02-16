package Leetcode;

import java.util.Scanner;

public class IsPresentQuery {
    static int[] makeFrequencyArray(int[] arr){
        int[] freq = new int[100001];
        for (int i =0; i<arr.length;i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("ENter the " + n + " Elements");
        for (int i = 0; i <n ; i++) {
            arr[i] = sc.nextInt();
        }

        int[] frq = makeFrequencyArray(arr);
        System.out.println("Enter the queries");
        int q = sc.nextInt();
        while (q>0){
            System.out.println("enter number to be searched");
            int x = sc.nextInt();
            if (frq[x] >0){
                System.out.println("Yes");
            }else{
                System.out.println("NO");
            }
            q--;
        }
    }

}
