package Activities;

public class Activity12 {
    public static void main(String[] args) {
        //Lambda function with return
         Addable ad1 = (num1, num2) -> (num1+num2);
         System.out.println(ad1.add(10,20));
        //Lambda function without return
         Addable ad2 = (num1, num2) -> {
             return (num1+num2);
         };



    }
}
