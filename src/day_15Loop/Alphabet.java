package day_15Loop;

public class Alphabet {

    public static void main(String[] args) {

        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
        }
        System.out.println();
        for (char ş = 'a'; ş <= 'z'; ş++) {
            System.out.print(ş + " ");
        }

        System.out.println();

        for(char x='A';x<='Z';x++) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.println("................................");
     for (char ch='z';ch>='a';ch--){
         System.out.print(ch+" ");
     }


    }

}
