import java.util.Random;
import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
 eqls();

    }

    public static int[] madeArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i * 8;
        }
        return arr;
    }

    public static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int pushNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько элементов в массиве?");
        int n;
        n = sc.nextInt();
        sc.close();
        return n;
    }

    public static void printRandomNumber() {
        Random x = new Random();
        int a = x.nextInt(-200);
        System.out.println(a);


    }
    public static void printF (){
        System.out.printf("Слово: %s, Число с плавающей запятой: %f, Целое число: %d, Символ: %c",
                "Java", 2.5f, 20, 'e');
    }
    public static void eqls (){
        String str1 = "A";
        String str2 = "B";
        String str3 = "C";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        if(str1.equals(str1)){
            System.out.println("Юра прости мы все проебали");

        }
    }


}


