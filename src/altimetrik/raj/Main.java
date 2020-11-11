package altimetrik.raj;

/*-Write a method called reverse() with an int array as a parameter.

-The method should not return any value. In other words, the method is allowed to modify the array parameter.

-In main() test the reverse() method and print the array both reversed and non-reversed.

-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


Tip:
	-Create a new console project with the name eReverseArrayChallengef
	*/


import java.util.Scanner;

public class Main {
        public static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
	    int count=0;
        System.out.println("Enter the size of an Array..");
        count=scanner.nextInt();
        int[] ArrayOne=GetIntegerArray(count);
        System.out.println("The Getted Arrays are..");
        PrintArray(ArrayOne);
        System.out.println("Reverse Array is");
        reverseArray(ArrayOne);


    }

    private static void reverseArray(int[] arrayOne) {
        int[] revArray=new int[arrayOne.length];
       for(int i=0,revlength= revArray.length;i< arrayOne.length;i++,revlength--){
           revArray[i]=arrayOne[revlength-1];
       }
        PrintArray(revArray);
    }

    private static void PrintArray(int[] arrayOne) {
        for (int i=0;i<arrayOne.length;i++){
            System.out.println(arrayOne[i]);
        }
    }

    private static int[] GetIntegerArray(int count) {
        int[] ArrayFirst=new int[count];
        for (int i=0;i<count;i++){
            ArrayFirst[i]=scanner.nextInt();
        }
        return ArrayFirst;
    }
}
