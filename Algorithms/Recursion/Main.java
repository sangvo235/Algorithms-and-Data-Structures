public class Main {

    public static void main(String[] args) {

        walk(5);

    }

    private static void walk(int steps) {
        // Recursion works because system use a call stack

        for (int i = 0; i < steps; i++) {

            if (steps < 1)
                return; // base case
            System.out.println("You take a step!");
            walk(steps - 1); // recursive

        }
    }
}