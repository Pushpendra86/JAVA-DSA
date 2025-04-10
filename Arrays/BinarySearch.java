public class BinarySearch {
    //Complexity O(log n)
    public static int binarySearch(int arr[], int key){
        int start = 0, end = arr.length-1;

        while(start<=end){
            int mid=(start+end)/2;
            if (arr[mid]==key){
                return mid;
            }
            if (arr[mid]>key){
                end = mid-1;
            }else {
                start =mid+1;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        int key =7;
        System.out.println("key is at at: "+binarySearch(arr,key));
    }
}
