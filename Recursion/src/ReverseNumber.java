public class ReverseNumber {
    static void rev(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        rev(n-1);

    }

    public static void main(String[] args) {
        rev(10);
    }
}
