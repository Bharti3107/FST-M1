package Activities.Activity5;

public class MyBook extends Book{
    //declaring abstract method in subclass
    public void setTitle(String s)
    {
        title = s;
    }

    public static void main(String[] args) {
        MyBook newNovel = new MyBook();
        //calling abstract method
        newNovel.setTitle("Mehula");
        //calling concrete methos
        System.out.println("Book Title is: "+newNovel.getTitle());
    }
}
