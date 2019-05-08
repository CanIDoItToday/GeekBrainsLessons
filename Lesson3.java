

public class Lesson3 {
    public static void main(String[] args) {
        int[] a =new int[5];
        madeArr(a);
        arrSum(a);
        printArr(a);
        System.out.println(arrSum(a));

    }
public static int[] madeArr(int[] arr){
    for (int i = 0; i <arr.length ; i++) {
        arr[i]= i*8;
    } return arr;
}
public static int arrSum (int[] arr){
        int sum=0;
    for (int i = 0; i <arr.length ; i++) {
        sum+=arr[i];
    }
    return sum;
}
public static void printArr (int[] arr){
    for (int i = 0; i <arr.length ; i++) {
        System.out.print(arr[i]+ " ");
    }
    System.out.println();
}

}


