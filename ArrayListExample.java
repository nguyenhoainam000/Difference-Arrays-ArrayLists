import java.util.ArrayList;

public class ArrayListExample
{
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("The number is : ");
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.println( numbers.get(i));
        }
        numbers.set(0, 4); //change element at index 0 = 4

        System.out.println("The number after change : ");
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.println( numbers.get(i));
        }

        numbers.remove(2); // Remove an element
        System.out.println("The number after remove : ");
        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.println( numbers.get(i));
        }

    }
}

