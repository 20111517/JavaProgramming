package day_20Arrays;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {
        char[]alphabet=new char[26];
        char ch='A';
        for (int i = 0; i < alphabet.length; i++,ch++) {
            alphabet[i]=ch;

        }

        System.out.println(Arrays.toString(alphabet));
        System.out.println(alphabet[22]);

    }






}
