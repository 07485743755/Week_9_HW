package week_9_HW;

import java.util.Map;

public class HashMap {

    /*
    9. Create a HashMap object called people that will store String keys and Integer
    values: And use for each loop to iterate the value from Map.
     */

    //Instance method
    public void hashMap(){

        Map<String, Integer> people = new java.util.HashMap<String ,Integer>();

        people.put("John",45);
        people.put("Carry",34);
        people.put("Jems",6);
        people.put("Peter",98);
        people.put("Anna",3);
        people.put("Elizabeth",79);

        //System.out.println(people);

        for(String i :  people.keySet()){

            System.out.println("key: " + i + " value: " + people.get(i));
        }
    }

    //Main method
    public static void main(String[] args) {

        HashMap map=new HashMap();  //create object
        map.hashMap(); //call hashMap method via map object
    }
}
