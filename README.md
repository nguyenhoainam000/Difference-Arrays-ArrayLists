The common point between Array and Arraylist is that they are used to store elements, which may contain NULL values, which may have duplicate values. The difference between Array and Arraylist is:

Array: cannot change the size of the array. 

Arraylist: can be resized.

Array: if you want to add or remove elements, you must create a new array.

Arraylist: you can add or remove elements at any time.

Array does not need to import libraries.

Arraylist: need to import library. import java.util.ArrayList;

Here is example are Array and Arraylist

Array: 

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

ArrayListExample:

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





In sum, Array and Arraylist both have different advantages. If you do not know the size of the array, using Arraylist will be more optimal. If you already know the size of the array, using Array will be more optimal.
