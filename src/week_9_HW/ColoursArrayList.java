package week_9_HW;

import java.util.ArrayList;
import java.util.List;

public class ColoursArrayList {

    /*
    4.  Write a Java program to create a new array list, add some colours (string) and
        printout the collection using for each loop.
    */

    //Instance method
    public void coloursArray(){

        List<String> list= new ArrayList<String>();
        list.add("White");
        list.add("Blue");
        list.add("Pink");
        list.add("Black");
        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("Burgundy");
        list.add("Peach");
        list.add("Gray");

        for(String n :list){

            System.out.println(n);
        }

        System.out.println("\n ArrayList of different colours : "+list);
    }

    //Main method
    public static void main(String[] args) {

        ColoursArrayList clr=new ColoursArrayList(); //create object
        clr.coloursArray();  //call method coloursArray by clr object
    }

}
