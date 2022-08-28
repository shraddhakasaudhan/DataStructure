package arrayLists;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        //add element
        list.add(0);
        list.add(4);
        list.add(6);
        list.add(8);
        list.add(5);
        System.out.println(list);

        //get element
        int element = list.get(1);
        System.out.println(element);

        //to add element in between
        list.add(2, 9);
        System.out.println(list);

        //set element
        list.set(0,2);
        System.out.println(list);

        //delete element
        list.remove(5);
        System.out.println(list);

        //size
        int size = list.size();
        System.out.println(size);

        //loops
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
