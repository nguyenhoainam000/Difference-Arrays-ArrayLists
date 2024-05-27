public class Array
{
    public static void main(String[] args)
    {
        int[] num = {1, 2, 3};
        for (int i = 0; i < num.length; i++)
        {
            System.out.println( num[i]);
        }
        num[0] = 4;    //change element at index 0 = 4
        System.out.println("New number is : ");
        for (int i = 0; i < num.length; i++)
        {
            System.out.println( num[i]);
        }

        System.out.println("New number is : ");
        int[] num2= new int[3]; //another way to declare array
        num2[0]=1;
        num2[1]=2;
        num2[2]=3;
        for (int i = 0; i < 3; i++)
        {
            System.out.println( num2[i]);
        }
    }
}


