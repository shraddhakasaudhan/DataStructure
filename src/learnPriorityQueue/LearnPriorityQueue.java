package learnPriorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        //priority queue implement to queue
//        Queue<Integer> pq = new PriorityQueue<>();
//
//        //for using to put element in queue
//        pq.offer(40);
//        pq.offer(24);
//        pq.offer(12);
//        pq.offer(56);
//
//        System.out.println(pq); //when we print this list then order is changed in output because
//        // implemented min heap internally and in min heap the smallest element on the top in the heap.
//
//
//        //poll : remove element and print or return remove element
//        System.out.println(pq.poll());
//
//        System.out.println(pq);
//
//        //peek check : which value is coming next
//        System.out.println(pq.peek());

        //Now if we want to find the largest element is in prior
        //now it convert min heap to max Heap
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(40);
        pq.offer(24);
        pq.offer(12);
        pq.offer(56);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());
    }

}
