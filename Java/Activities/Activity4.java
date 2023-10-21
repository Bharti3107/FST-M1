package Activities;

public class Activity4 {
    public static void main(String[] args) {
        int [] numArray = {30,12,56,32,9,90};
        int temp = 0;
        //Before sorting
        System.out.println("Array before sort");
        for(int i = 0;i<numArray.length;i++)
        {

            System.out.print(numArray[i]+" ");

        }
//sort logic
        for(int i=0;i< numArray.length;i++)
        {
            for (int j=i+1;j<numArray.length;j++)
            {
                if(numArray[i]>numArray[j])
                {
                    temp = numArray[i];
                    numArray[i]=numArray[j];
                    numArray[j]=temp;
                }
                System.out.println();
                System.out.print("Array after sorting");
                System.out.println();
                for (i=0;i<numArray.length;i++)
                {

                    System.out.print(numArray[i]+" ");
                }
            }
        }

    }
}
