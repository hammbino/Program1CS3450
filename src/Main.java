import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    // Test Driver
    public static void main(String[] args) {
        // Do ints
        Queue q = new Queue(new ArrayList()); // No default ctor, so we need to provide it here at init
        q.push(1);
        q.push(2);
        LinkedList alist = new LinkedList();
        alist.add(3);
        q.changeStorage(alist);
        q.push(4);
        q.push(5);
        displayAndEmptyQueue(q);

        // Do strings
        Queue q2 = new Queue(new ArrayList());
        q2.push("1");
        q2.push("2");
        LinkedList alist2 = new LinkedList();
        alist2.add("3");
        q2.changeStorage(alist2);
        q2.push("4");
        q2.push("5");
        displayAndEmptyQueue(q2);
    }

    private static void displayAndEmptyQueue(Queue q) {
        while (q.length() > 0) {
            System.out.print(q.pop() + " ");
        }
        System.out.println();
    }
}
