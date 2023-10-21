package Activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {
        //create object for Scanner class
        Scanner scan = new Scanner(System.in);
        //Declaring an Arraylist
        List <Integer> list = new ArrayList<>();
        //create object for Random class
        Random indexGen = new Random();
        //accepting integer value and checking the same using hasNextInt
        System.out.println("Enter the numbers");
         while (scan.hasNextInt())
         {
             list.add(scan.nextInt());
         }
         //Converting an arraylist into an array to print the number
          Integer [] num = list.toArray(new Integer[0]);
           int index = indexGen.nextInt(num.length);
           System.out.println("Index is: "+index);
           System.out.println("Element of array are: "+num[index]);
    }
}
