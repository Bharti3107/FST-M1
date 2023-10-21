package Activities;

public class Activity8 {
    public static void exceptionTest(String s) throws CustomException
    {
      if (s==null)
      {
          throw new CustomException("String is null");
      }else
      {
          System.out.println(s);
      }
    }
    public static void main(String[] args) {
        try {
            //Method call with string input
            Activity8.exceptionTest("Will print to the screen");
            //method call with null input
            Activity8.exceptionTest(null);

        } catch (CustomException e) {
            throw new RuntimeException(e);
        }


    }

}
