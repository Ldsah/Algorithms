import java.util.Scanner;
public class BinarySearch {
    //следующая задача угадай какое число загадал пользователь

    public static void main(String[] args){
        int[] array = new int[60];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        System.out.println(BinarySearch(array, target));
    }
    //есть ли введенное число в массиве
    public static boolean BinarySearch(int[] array, int target){



    }
}
