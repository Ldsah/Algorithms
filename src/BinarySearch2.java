public class BinarySearch2 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 6, 8, 16, 22, 27};
        System.out.println(BinarySearch(arr, -2));

    }
    public static int BinarySearch(int [] arr, int target){
        int lowerbound = 0;
        int upperbound = arr.length-1;
        int expected;
        while(lowerbound<upperbound){ //нижняя граница меньше верхней, иначе элемент не найден
            expected = (lowerbound + upperbound)/2; //сокращаем диапазон поиска в 2 р
            if(target == arr[expected]){
                return expected;
            }else if(target > arr[expected]){
                lowerbound = expected+1; //нижней границей становится делимое двух границ плюс один,
                // так как число точно находится в верхнем диапазоне поиска, иначе оно было бы равно expected
            }else if(target < arr[expected]){
                upperbound = expected-1;
            }
        }
        return -1;


        }
    }


