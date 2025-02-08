public class LinearSearch {

    //time complexity O(n)
    public static int linearSearch(int[] arr, int key){
        for (int i=0;i<arr.length;i++){
            if (arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int arr[]= {3,2,1,5,4,6};
        int key = 4;

        int index=linearSearch(arr,key);
        if (index == -1){
            System.out.println("key is not found at index");
        }else {
            System.out.println("key is found at index :" +index);
        }
    }
}
