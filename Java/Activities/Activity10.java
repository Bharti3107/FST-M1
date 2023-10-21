package Activities;

import java.util.HashSet;
import java.util.List;

public class Activity10 {
    public static void main(String[] args) {
        //creating a Hashset
        HashSet<String> hs = new HashSet<String>();
        //adding element to the hashset
        hs.add("Apple");
        hs.add("Cheey");
        hs.add("Grapes");
        hs.add("Banana");
        hs.add("Pear");
        hs.add("Papaya");
        //printing size of Hashset
        System.out.println("The size of the Hashset is: " + hs.size());
        //remove an element from the Hashset
        hs.remove("Apple");
        //remove the elelment not present in the Hashset
        if (hs.remove("Mango")) {
            System.out.println("Mango removed from the Hashset");
        } else {
            System.out.println("Mango not present in the Hashset");
        }
        if (hs.contains("Papaya")) {
            System.out.println("Papaya present in the Hashset");
        } else
            System.out.println("Papaya is not present in the Hashset");
        //printing the updated Hashset
        System.out.println(hs);

    }
}
