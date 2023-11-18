import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task #1");
        System.out.println(task1(new int[] {3,5,-1,99,6})); //true - -1
        System.out.println("Task #2");
        System.out.println(Arrays.toString(task2(new int[]{3, 5, -1, 99, 6}))); //true - [-1, 3, 5, 6, 99]
        System.out.println("Task #3");
        System.out.println(task3(5)); //true - 120
        System.out.println("Task #4");
        System.out.println(task4(new int[] {4,1,65,2,9,13,32})); //true - 3
        System.out.println("Task #5");
        System.out.println(task5(5)); //true - true
        System.out.println("Task #6");
        System.out.println(task6("Hello")); //true - 2
        System.out.println("Task #7");
        System.out.println(task7(new int[] {4,3,5})); //true - 4
        System.out.println("Task #8");
        System.out.println(task8(12,16)); //true - 4
    }
    public static int task1(int[] ar){
        Arrays.sort(ar);
        return ar[0];
    }
    public static int[] task2(int[] ar) {
        for (int i = 0; i < ar.length-1; i++) {
            for (int j = 0; j < ar.length-i-1; j++) {
                if (ar[j] > ar[j+1]) {
                    int tmp = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = tmp;
                }
            }
        }
        return ar;
    }
    public static int task3(int n){
        if (n == 0 || n == 1){
            return 1;
        } else if (n < 0) {
            return -1;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial*=i;
        }
        return factorial;
    }
    public static int task4(int[] ar){
        int sum = 0;
        for (int n:ar) {
            if (n%2==0){
                sum++;
            }
        }
        return sum;
    }
    public static boolean task5(int n){
        for (int i = 1; i < 13; i++) {
            if (n!=i && i != 1){
                if (n%i==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static int task6(String s){
        int count = 0;
        char[] letters = s.toUpperCase().toCharArray();
        for (char letter : letters) {
            if (letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U' || letter == 'Y'){
                count++;
            }
        }
        return count;
    }
    public static int task7(int[] ar){
        int sum = 0;
        for (int n:ar) {
            sum += n;
        }
        return sum/ar.length;
    }
    public static int task8(int n, int m){
        int min = Math.min(n,m);
        for (int i = min; i > 1; i--) {
            if (n%i==0 && m%i==0){
                return i;
            }
        }
        return 1;
    }
}