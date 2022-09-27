import java.util.ArrayList;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = generateRandomArray();
//    String a= Arrays.toString(arr);
//    System.out.println(a);
        //Задание 1
        int sumMonth=0;
        for (int i:arr){
            sumMonth+=i;
        }
        System.out.println("Сумма трат за месяц составила "+sumMonth+" рублей");
        //Задание2
        int max=0;
        int min=200_000;
        for (int i:arr) {
            if (i>max){
                max=i;
            }
            if (i<min){
                min=i;
            }
        }
        System.out.println("Минимальная сумма трат за день "+min+"рублей");
        System.out.println("Максимальная сумма трат за день "+max+"рублей");
        //Задание3
        float sumMonth1=sumMonth;
        float arr1=arr.length;
        float averagleValueMonth=sumMonth1/ arr1;
        System.out.println("Средняя сумма трат за месяц "+averagleValueMonth+" рублей");
        //Задание4
    /*Arrays.sort(arr);
    String b= Arrays.toString(arr);
    System.out.println(b);*/
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        int i=reverseFullName.length;
        for (;i<= reverseFullName.length;i--){
            if (i>0){
                System.out.print(reverseFullName[i-1]);
            }
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}