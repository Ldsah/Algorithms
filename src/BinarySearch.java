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
    public static String BinarySearch(int[] array, int target){
        int lowerbound = 0;
        int upperbound = array.length-1;
        while(target <= (array.length-1)){
            int expected = (lowerbound + upperbound)/2;
            if(expected == target){
                return "Число найдено: " + expected;
            }
            else if(target > expected){
                lowerbound = expected;
            }else if(expected > target){
                upperbound = expected;
            }
        }
        return "Число не содержится в массиве.";

    }


}
