package Activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap <Integer,String> hm = new HashMap<>();
        //adding values to the hashmap
        hm.put(1,"Red");
        hm.put(2,"Yellow");
        hm.put(3,"Orange");
        hm.put(4,"Black");
        hm.put(5,"White");
        //remove color
        hm.remove(2);
        //check color exist in the map or not
        if(hm.containsValue("Greeen"))
        {
            System.out.println("Color is exist in the map");
        }else
        {
            System.out.println("Color is not exist in the map");
        }
        //Print the size of Map
        System.out.println("Size of the map is:" +hm.size());
        //Print the map
        System.out.println(hm);

    }
}
