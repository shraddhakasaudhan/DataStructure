package learnSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LearnLinkedHashSet {
    public static void main(String[] args) {

        //LinkedHashSet maintain list order
        Set<Integer> st = new LinkedHashSet<>();

        st.add(34);
        st.add(32);
        st.add(44);
        st.add(78);

        System.out.println(st);

        st.remove(44);
        System.out.println(st);

        System.out.println(st.contains(32));

        System.out.println(st.isEmpty());

        System.out.println(st.size());

    }
}
