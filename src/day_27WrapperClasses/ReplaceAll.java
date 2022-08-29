package day_27WrapperClasses;
import java.util.Arrays;
public class ReplaceAll {

    public static void main(String[] args) {


        int[] arr = {10, 20, 30, 30, 30, 40, 50, 50};
        arr = replaceAll(arr, 30, 300);
        System.out.println(Arrays.toString(arr));

        double[] arr1={10.5,20.5,30.5,30.5,30.5,40.5};
        arr1=replaceAll(arr1,30.5,60);
        System.out.println(Arrays.toString(arr1));

        char[]arr2={'a','b','c','d','d','e','e','d'};
        arr2=replaceAll(arr2,'d','f');
        System.out.println(Arrays.toString(arr2));

        String[] arr3={"Ahmet","Emine","Emine","Emine","Emine","Tarık"};
        arr3=replaceAll(arr3,"Emine","Derya");
        System.out.println(Arrays.toString(arr3));
    }

    public static int[] replaceAll(int[] array, int oldValue, int newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }


        }

        return array;
    }



    public static double[]replaceAll (double[]array,double oldValue,double newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }



        }

        return array;
    }

    public static char[]replaceAll (char[]array,char oldValue,char newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }



        }

        return array;
    }

    public static String[]replaceAll (String[]array,String oldValue,String newValue) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == oldValue) {
                array[i] = newValue;
            }



        }

        return array;
    }
}








/*
2. ReplaceAll Task:
		2.1 Create a method named replaceAll that passes three parameters: integer array, integer oldElement, integer newElement. The method replaces all the element of the array that matching with the given old element with the given new element, and returns the new array.
			Ex:
				arr = {10, 10, 20, 30, 40, 30, 30, 30};
				replaceAll(arr, 30, 300) ==> {10, 10, 20, 300, 40, 300, 300, 300}
		2.2 Create the same functions for double arrays, char arrays, and String arrays
 */