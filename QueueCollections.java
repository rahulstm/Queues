package Queues;
import java.util.LinkedList;
import java.util.Queue;
public class QueueCollections {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(5);
       // System.out.println(queue.poll());
        // System.err.println(queue.poll());   // poll() -  returns and removes the element at the front of the queue
        System.out.println(queue.peek());    // peek() -  returns the element at the front of the queue without removing it
        System.out.println(queue.size());
    }
    
}
