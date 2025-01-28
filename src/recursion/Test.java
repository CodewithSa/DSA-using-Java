package recursion;

public class Test {
    public static void main(String[] args) {
        Recursion r = new Recursion();
        System.out.println("Factorial: " + r.factorial(3));
        System.out.println("Fibonacci Number: " + r.fibonacciNumber(4));

        r.printArray(new int[] {2, 3, 4, 5});
        System.out.println("Sum of Array is " + r.sumOfArray(new int[] {1, 2, 3, 4}));


    }
}
