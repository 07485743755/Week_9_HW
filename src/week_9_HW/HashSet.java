package week_9_HW;

import java.util.Set;

public class HashSet {

    /*
    8. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
    Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
    and if else)
     */

    //Instance method
    public void hashSet() {

        Set<Integer> num = new java.util.HashSet<>();

        num.add(4);
        num.add(7);
        num.add(8);

        System.out.println(num);

        for (int i = 1; i <= 10; i++) {

            if (num.contains(i)) {

                System.out.println("\n\t" + i + "\t is found in set");

            }

        }

    }

    //Main method
    public static void main(String[] args) {

       HashSet set=new HashSet();  //create object
        set.hashSet();  //call hashmap method via map object

    }

}
