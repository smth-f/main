class Solution {
    public static void main(String[] args) {
        System.out.println("#1");
        System.out.println(findNextPerfectSquare(121));
        System.out.println("#2");
        System.out.println(findShort("Hallo weee"));
        System.out.println("#3");
        System.out.println(persistence(992));
    }
    //findNextPerfectSquare
    //You might know some pretty large perfect squares. But what about the NEXT one?
    //Complete the findNextPerfectSquare method that finds the next integral perfect square
    // after the one passed as a parameter. Recall that an integral perfect
    // square is an integer n such that sqrt(n) is also an integer.
    public static long findNextPerfectSquare(long sq){
        double sqrt = Math.sqrt(sq);
        if (sqrt == (int) sqrt){
            sqrt++;
            sqrt = Math.pow(sqrt,2);
            //если переменная sq не является "идеальным" корнем, то вернём -1
        } else {
            return -1;
        }
        return (long)sqrt;
    }

    //Shortest Word
    //Simple, given a string of words, return the length of the shortest word(s).
    //String will never be empty and you do not need to account for different data types.
    public static int findShort(String s) {
        String[] arr = s.split(" ");
        int minLength = arr[0].length();
        for (int i = 0; i < arr.length; i++) {
            if (minLength>arr[i].length()){
                minLength=arr[i].length();
            }
        }
        return minLength;
    }

    //Write a function, persistence, that takes in a positive parameter num and returns
    // its multiplicative persistence, which is the number of times you must multiply
    // the digits in num until you reach a single digit.
    public static int persistence(int a) {
        String str = String.valueOf(a);
        int count = 0;

        while (str.length() > 1) {
            int res = 1;
            for (int i = 0; i < str.length(); i++) {
                int digit = Character.getNumericValue(str.charAt(i));
                res *= digit;
            }
            str = String.valueOf(res);
            count++;
        }
        return Integer.parseInt(str);
    }
}