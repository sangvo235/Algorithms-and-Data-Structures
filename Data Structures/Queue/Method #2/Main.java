public class Main {
    public static void main(String[] args) {

        Queue q = new Queue();
        q.enQueue(5);
        q.enQueue(2);
        q.enQueue(7);
        q.enQueue(3);
        
        q.deQueue();
        q.deQueue();

        q.enQueue(9);
        q.enQueue(1);

        // q.enQueue(12);
        // q.enQueue(4);

        System.out.println("Is the queue empty? " + (q.isEmpty() ? "Yes" : "No"));
        System.out.println("Is the queue full? " + (q.isFull() ? "Yes" : "No"));
        System.out.println("Size: " + q.getSize());    
        q.show();

    }
}
