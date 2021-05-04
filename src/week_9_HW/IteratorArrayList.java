package week_9_HW;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorArrayList {
    /*
    5. Write a Java program to iterate through all elements in an array list using
       Iterator
     */

    //Instance method
    public void iteratorArray(){

        List<Integer> list=new ArrayList<Integer>();

        list.add(43);
        list.add(23);
        list.add(90);
        list.add(4);
        list.add(3);
        list.add(0);
        list.add(73);
        list.add(403);
        list.add(439);
        list.add(678);

        Iterator itr=list.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());
        }

        System.out.println("ArrayList : "+ list);
    }

    //Main method
    public static void main(String[] args) {

        IteratorArrayList array=new IteratorArrayList(); //create object
        array.iteratorArray(); //call iteratorArray method via array object
    }
}
