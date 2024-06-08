public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorial(7));

    }

    private static int factorial(int num) {
        // Recursion works because system use a call stack

        if (num < 1)
            return 1; // base case
        return num * factorial(num - 1); // recursive
    }
}
