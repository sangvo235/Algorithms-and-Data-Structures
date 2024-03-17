public class Main {

    public static void main(String[] args) {
        
        Stack nums = new Stack();
        nums.push(15);
        nums.push(8);
        nums.push(10);

        System.out.println(nums.peek() + " is at the top of the stack.");

        System.out.println(nums.pop() + " is removed from the top of the stack.");

        nums.push(5);
        nums.push(13);
        nums.push(19);

        nums.show();
        System.out.println("\n" + nums.size() + " is the size of the stack.");
        System.out.println(nums.isEmpty() ? "The stack is empty." : "The stack is not empty.");

        // Test the stack overflow
        nums.push(2);

        // Test the stack underflow
        nums.pop();
        nums.pop();
        nums.pop();
        nums.pop();
        nums.pop();
        nums.pop();

    }
    
}
