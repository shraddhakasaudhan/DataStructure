package learnSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnTreeSet {
    public static void main(String[] args) {

        //Let's take a new example for creating custom class not primitive
        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student("Adi", 3));
        studentSet.add(new Student("Shiv", 2));
        studentSet.add(new Student("Tony", 7));
        studentSet.add(new Student("Man", 1));

//        /*when if we're not using equals : then it print same rollNo's and same name's student because
//        on the basis of new objects here we are creating new objects so hashSet can not differentiate*/

//        studentSet.add(new Student("Raman", 3));


        /*when we're using equals and hashCode Method: equals method checks element is already present or
        not to tell on the basis of here we gave only rollNo property if rollNo are same then set not added
        those students and hashCode method generate hashCode basis on rollNo
        so if roll no are same then hashCode generate same hashCode, if hashCode are same
        then set not added those students*/

        studentSet.add(new Student("Raman", 3));

        //Let's take another example for equals method to check both are equals or not

        Student s1 = new Student("John", 6);
        Student s2 = new Student("Anu", 6);

        System.out.println(s1.equals(s2));


        System.out.println(studentSet);



        //It gives all element in sorted form and contains unique element and implements on BST
        //Time Complexity : O(logN)

//        Set<Integer> set = new TreeSet<>();
//
//        set.add(23);
//        set.add(4);
//        set.add(57);
//        set.add(89);
//        set.add(3);
//
//        System.out.println(set);
//
//        set.remove(3);
//        System.out.println(set);
//
//        System.out.println(set.contains(3));
//
//        System.out.println(set.size());
//
//        set.clear();
//        System.out.println(set);

    }
}
