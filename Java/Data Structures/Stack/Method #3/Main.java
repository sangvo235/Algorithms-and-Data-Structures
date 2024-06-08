public class Main {

    public static void main(String[] args) {
        
        DynamicStack nums = new DynamicStack();

        nums.push(7);
        nums.show();
        nums.push(3);
        nums.show();
        nums.push(9);
        nums.show();
        nums.push(5);
        nums.show();
        nums.push(4);
        nums.show();

        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        nums.pop();
        nums.show();
        
    }
    
}
