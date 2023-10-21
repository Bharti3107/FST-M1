package Activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {
    public static void main(String[] args) {
        List <String> myList= new ArrayList<>();
    //Adding names to the arraylist
          myList.add("Ram");
          myList.add("Shyam");
          myList.add("Krishna");
          myList.add("Radha");
          myList.add("Shiva");
    //Print names from the list
        for (String name: myList) {
            System.out.println("Arraylist names are: " + name);
        }
        //retrive 3rd name from the arraylist
        System.out.println("3rd name of the array list is:" +myList.get(2));
        //check if name exist or not in array list
        if(myList.contains("Ram"))
        {
            System.out.println("Given name exist in the arrayList");
        }else
        {
            System.out.println("Given name is not exist in the arrayList");
        }
        //print size of the arraylist
        System.out.println("Number of name in the arrayList are: "+myList.size());
        //remove a name from the array list
        myList.remove(2);
        System.out.println("Number of name in the arrayList are: "+myList.size());
}
}
