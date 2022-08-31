package learnLinkedListQueue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
    public static void main(String[] args) {

        //Linked list implements to Queue interface
        //and follow FIFO (First in first out)

        Queue<Integer> q = new LinkedList<>();

        //for using to put element in queue
        q.offer(12);
        q.offer(25);
        q.offer(56);

        System.out.println(q);

        //poll : remove element and print or return remove element
        System.out.println(q.poll());

        System.out.println(q);

        //peek check : which value is coming next
        System.out.println(q.peek());

    }
}
