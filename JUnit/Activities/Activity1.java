package Activity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {
    static ArrayList<String> list;
    @BeforeEach
    public void setUp() throws Exception
    {
        list = new ArrayList<>();
        //adding elements
        list.add("Apple");
        list.add("Banana");
    }
    @Test
    public void insetTest()
    {
        //Assert to check size of the Array
        assertEquals(2, list.size(), "Wrong size");
        //insert new value to the list
        list.add("Cherry");
        System.out.println(list);
        //Assert the size of updated array
        assertEquals(3, list.size(), "Wrong size");
        //Asset each elelment of the array
        assertEquals("Apple", list.get(0), "Wrong element");
        assertEquals("Banana",list.get(1),"Wrong element");
        assertEquals("Cherry",list.get(2),"Wrong element");
    }
    public void replaceTest()
    {
        list.set(1,"Cherry");
        assertEquals(2, list.size(), "Wrong size");
        assertEquals("Apple",list.get(0),"Wrong element");
        assertEquals("Cherry",list.get(1),"Wrong element");

    }
}
