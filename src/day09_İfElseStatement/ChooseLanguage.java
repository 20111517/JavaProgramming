package day09_İfElseStatement;

public class ChooseLanguage {
    public static void main(String[] args) {
        int n = 3;
        String message="";
        if (n == 1) {
            message = "Hello, thank for your call";
        } else if (n == 2) {
            message = "Hola, gracias para llamar";
        } else if (n == 3) {
            message = "Merhaba, aradiginiz icin tesekkurler";
        } else if (n == 4) {
            message = "Privet, spasibo za vash zvonok";
        } else if (n == 5) {
            message = "Merci ,pour votre appel";
        }

        System.out.println(message);


}




}
