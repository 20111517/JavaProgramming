package day_26CustomMethodPratctice;

import java.util.Arrays;

public class reverseArray2 {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8} ;
        boolean []barr=new boolean[arr.length];
        for (int i = arr.length-1; i >-1 ; i--) {
            if (arr[i] % 2 == 0) {
                barr[arr.length - 1 - i] = true;

            }

        }
            System.out.print(Arrays.toString(barr));
        }


    }

