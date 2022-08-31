package arrayLists;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

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

        //creating new list and add in this list
        ArrayList<Integer> newlist = new ArrayList<>();
        newlist.add(50);
        newlist.add(100);
        newlist.add(60);

        list.addAll(newlist);
        System.out.println(list);

        //set element
        list.set(0,2);
        System.out.println(list);

        //delete element by index
       list.remove(5);
       System.out.println(list);

       //This will return true if element is present in list otherwise false
       System.out.println(list.contains(5));

       //delete by giving type of value e.g. Integer
        list.remove(Integer.valueOf(50));
        System.out.println(list);

       //size
       int size = list.size();
       System.out.println(size);

        //sorting
        Collections.sort(list);
        System.out.println(list);

        //clear : this function is using for deleting all element in list
//        list.clear();
//        System.out.println(list);

        //loops
        for(int i=0; i<list.size(); i++){
            System.out.println("the element is " + list.get(i));
        }

        //by using for-each loop
        for (Integer value: list) {

            System.out.println("the value is : "+ value);
        }
        //Iterator function
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()){
            System.out.println("iterator " + it.next());
        }
    }

}
