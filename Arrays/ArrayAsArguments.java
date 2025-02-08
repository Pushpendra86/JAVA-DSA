public class ArrayAsArguments {
//array pass by reference not by value;
    public static void update (int marks[]){
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String args[]){
        int marks[] = {1,4,5};
        update(marks);
        //printing the marks
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }
        System.out.println();
    }
}
