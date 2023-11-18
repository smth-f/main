import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task #1");
        System.out.println(task1(new int[] {3,5,-1,99,6})); //true res - -1
        System.out.println("Task #2");
        System.out.println(Arrays.toString(task2(new int[]{3, 5, -1, 99, 6}))); //true res - [-1, 3, 5, 6, 99]
        System.out.println("Task #3");
        System.out.println(task3(5)); //true res - 120
        System.out.println("Task #4");
        System.out.println(task4(new int[] {4,1,65,2,9,13,32})); //true res - 3
        System.out.println("Task #5");
        System.out.println(task5(5)); //true res - true
        System.out.println("Task #6");
        System.out.println(task6("Hello")); //true res - 2
        System.out.println("Task #7");
        System.out.println(task7(new int[] {4,3,5})); //true res - 4
        System.out.println("Task #8");
        System.out.println(task8(12,16)); //true res - 4
        System.out.println("Task #9");
        System.out.println(task9(6)); //true res - 8
        System.out.println("Task #10");
        System.out.println(task10(new int[] {1,2,5,7,10})); //true res - [3, 4, 6, 8, 9]
        System.out.println("Task #11");
        System.out.println(task11(14541)); //true res - true
        System.out.println("Task #12");
        System.out.println(task12("Hello","loHel")); //true res - true
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
    public static int task9(int n) {
        if (n <= 1) {
            return n;
        } else {
            return task9(n-1) + task9(n-2);
        }
    }
    public static ArrayList<Integer> task10(int[] ar){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(ar);
        for (int i = 1; i < ar.length; i++) {
            int diff = ar[i] - ar[i - 1];
            if (diff > 1) {
                for (int j = 1; j < diff; j++) {
                    arrayList.add(ar[i - 1] + j);
                }
            }
        }
        return arrayList;
    }
    public static boolean task11(int n){
        String s = String.valueOf(n);
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean task12(String s1, String s2){
        char[] ar1 = s1.toCharArray();
        char[] ar2 = s2.toCharArray();
        if (ar1.length != ar2.length){
            return false;
        }
        for (char cr : ar1) {
            for (int j = 0; j < ar2.length; j++) {
                if (cr == ar2[j]) break;
                else if (j == ar2.length - 1) {
                    return false;
                }
            }
        }
        return true;
    }
}