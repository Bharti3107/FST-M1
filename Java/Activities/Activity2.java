package Activities;

public class Activity2
{
    public static void  main(String[] args)
    {
        int numArray[] = {10, 77, 1, 54, -11, 10};
       // int searchedNumber =10;
        //int sumofNum = 30;
     System.out.println("Sum of all the 10 are 30:"+result(numArray));

    }
        public static boolean result(int[] number) {
            int sum = 0;
            //checking for no 10 in the given array
            for (int num : number) {
                if (num == 10) {
                    //adding number 10 from the array
                    sum += 10;
                }
                if (sum > 30) {
                    break;

                }
            }

               return sum ==30;
        }
        }

