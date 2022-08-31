package learnArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;

public class LearnArrayDeque {

    public static void main(String[] args) {

        //In Double ended queue you can put and remove element from both sides front and rear
        //Using ArrayDeque you can implement queue and stack
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(12); //normal method add in last from queue
        adq.offerFirst(46); //add element in first from arrayDeque
        adq.offerLast(45); //add in last from arrayDeque
        adq.offer(67);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() " + adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() " + adq);

        System.out.println(adq.pollLast());
        System.out.println("pollLast() " + adq);



    }

}
