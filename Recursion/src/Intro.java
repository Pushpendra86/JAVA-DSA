import java.util.Scanner;

public class Intro {
    static void print(int n){
       //base case
        if (n ==1){
            System.out.println(n);
            return;
        }
        // smaller sub problem
        print(n-1);
        System.out.println(n);  //self work
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        print(n);
    }
}
