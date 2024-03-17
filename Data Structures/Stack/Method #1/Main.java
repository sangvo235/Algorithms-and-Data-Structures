import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<String>();

        // Check if stack is empty
        System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Call of Duty");
        stack.push("Boarderlands");
        stack.push("World of Warcraft");

        // stack.pop();
        // stack.pop();

        // System.out.println(stack.peek());

        // System.out.println(stack.search("Skyrim"));

        // System.out.println(stack);

    }
}
