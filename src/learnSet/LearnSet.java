package learnSet;

import java.util.HashSet;
import java.util.Set;

public class LearnSet {

    public static void main(String[] args) {

        //Duplicate value are not allowed
        //Time complexity : O(1)

        Set<Integer> set = new HashSet<>();

        set.add(33);
        set.add(56);
        set.add(31);
        set.add(54);
        set.add(23);

        //set.add(33);
        System.out.println(set);

        set.remove(33);
        System.out.println(set);

        //check element is present or not
        System.out.println(set.contains(312)); //return boolean value

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();
        System.out.println(set);
    }
}
