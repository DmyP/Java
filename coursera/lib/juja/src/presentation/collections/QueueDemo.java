package presentation.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue queue = new LinkedList(Arrays.asList("1", "Hello", 3));
//        queue.add("1");
//        queue.offer("Hello");
//        queue.add(3);
        System.err.println(queue);
        System.err.println("Peek " + queue.peek());
        System.err.println(queue);
        System.err.println("Poll " + queue.poll());
        System.err.println(queue);
        System.err.println("Element " + queue.element());
        System.err.println(queue);
        System.err.println("Remove " + queue.remove());
        System.err.println(queue);
        queue.remove();
        System.err.println(queue.poll());
        System.err.println(queue.peek());
    }
}
