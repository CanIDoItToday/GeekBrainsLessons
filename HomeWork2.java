import java.util.Arrays;

public class HomeWork2 {
    public static void main(String[] args) {


//        1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//        С помощью цикла и условия заменить 0 на 1, 1 на 0;

//        int[] arr1 = {0,1,1,0,1,0};
//
//        for (int j = 0; j <arr1.length ; j++) {
//            if(arr1[j]==0){
//                arr1[j]=1;
//            }else{
//                arr1[j]=0;
//            }
//            System.out.print(arr1[j]+" ");
//        }

//        2. Задать пустой целочисленный массив размером 8.
//        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

//        int[] arr2 = new int[8];
//        for (int i = 0; i <arr2.length ; i++) {
//            arr2[i]= i*3;
//        }
//        System.out.println(Arrays.toString(arr2));

//        3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//        и числа меньшие 6 умножить на 2;

//        int[] arr3 ={1,5,3,2,11,4,5,2,4,8,9,1};
//        for (int i = 0; i <arr3.length ; i++) {
//            if(arr3[i]<6){
//                arr3[i]*=2;
//            }
//        }
//        System.out.println(Arrays.toString(arr3));

//        4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//                и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

//            int[][] arr4 =new int [5][5];
//        for (int i = 0; i <arr4.length ; i++) {
//            for (int j = 0; j <arr4[i].length ; j++) {
//                if(i==j){
//                    arr4[i][j]=1;
//                }
//                System.out.print(arr4[i][j] + " ");
//            }System.out.println();
//        }

//        5. ** Задать одномерный массив и найти в нем минимальный и
//        максимальный элементы (без помощи интернета);

        int[] arr5 = {4, 7, 13, 5, 9, 3, 64, 3};
        int max = arr5[0];
        int min = arr5[0];
        for (int i = 0; i < arr5.length; i++) {

            if (arr5[i] > max) {
                max = arr5[i];
            }
            if (arr5[i] < min) {
                min = arr5[i];
            }
        }
        System.out.println(max);
        System.out.println(min);


    }
}






