package recursion;

public class Recursion {

    public void printNumbers(int num) {
        if (num == 0)
            return;

        printNumbers(num - 1);
        System.out.println(num);
    }

    public int factorial(int num) {
        if (num == 0 || num == 1)
            return 1;

        return num * factorial(num - 1);
    }

    public int fibonacciNumber(int num) {
        if (num == 0 || num == 1)
            return num;

        return fibonacciNumber(num - 1) + fibonacciNumber(num - 2);
    }

    public int sumOfDigits(int digit) {
        if (digit >= 0 && digit <= 9)
            return digit;

        return sumOfDigits(digit / 10) + digit % 10;
    }

    public int powerOf(int num, int power) {
        if (power == 0)
            return 1;

        return powerOf(num, power - 1) * num;
    }

    public void kMultiple(int num, int k) {
        if (k == 1) {
            System.out.println(num);
            return;
        }

        kMultiple(num, k - 1);
        System.out.println(num * k);
    }

    // Alternate sign sum of series
    public int seriesSum(int num) {
        if (num == 0)
            return 0;

        if (num % 2 == 0)
            return seriesSum(num - 1) - num;
        else
            return seriesSum(num - 1) + num;
    }

    private void printArrHelper(int[] arr, int idx) {
        if (idx < 0)
            return;

        printArrHelper(arr, idx - 1);
        System.out.println(arr[idx]);
    }

    public void printArray(int[] arr) {
        printArrHelper(arr, arr.length - 1);
    }

    private int maxHelper(int[] arr, int idx) {
        if (idx == 0)
            return arr[idx];

        return Math.max(maxHelper(arr, idx - 1), arr[idx]);
    }

    public int max(int[] arr) {
        return maxHelper(arr, arr.length - 1);
    }

    private int sumOfArrHelper(int[] arr, int idx) {
        if (idx < 0)
            return 0;

        return sumOfArrHelper(arr, idx - 1) + arr[idx];
    }

    public int sumOfArray(int[] arr) {
        return sumOfArrHelper(arr, arr.length - 1);
    }



}
