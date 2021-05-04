package week_9_HW;

import java.util.ArrayList;
import java.util.List;

public class UnderGroundArrayList {

    /*
    7. Write a Java program to test an array list is empty or not. Define array list with
       underground tube names
     */


    //Instance method
    public void underGroundTube(){

        List<String> list=new ArrayList<String>();

        list.add("BakerLoo");
        list.add("Victoria");
        list.add("Hammersmith & City");
        list.add("Central");
        list.add("Circle");
        list.add("District");
        list.add("Jubilee");
        list.add("Metropolitan");
        list.add("Northern");
        list.add("Piccadilly");
        list.add("");


        System.out.println("\nArrayList :"+list);

        if(list.isEmpty()){

            System.out.println("\nArrayList is empty");
        }else{

            System.out.println("\nArrayList is not empty");
        }

    }

    //Main method
    public static void main(String[] args) {

        UnderGroundArrayList empty=new UnderGroundArrayList();  //Create object
        empty.underGroundTube(); //call underGroundTube method via empty object

    }
}
