package day14_String;

public class StringMethod1 {

    public static void main(String[] args) {

String str="     batch 25        ";
str=str.trim();
        System.out.println("str = " + str);

String word="   Ahmet Emin Şahin  bugün eve geç geldi.        ";
String word1=word.trim();
        System.out.println("word1 = " + word1);

    String str2="Cydeo School";
    int n1=str2.indexOf('c')+2;
        System.out.println("n1 = " + n1);
    int n2=str2.indexOf('o');
        System.out.println("n2 = " + n2);
    int n3=str2.indexOf("ool");
        System.out.println("n3 = " + n3);
int n4=str2.lastIndexOf('o');

        System.out.println("n4 = " + n4);

        System.out.println("......................................");
    String word2="I love the film series of Matrix";
    int s1=word2.indexOf('f');
    int secondf=word2.indexOf("f ");
    int firste=word2.indexOf('e');
int seconde=word2.indexOf("e f");
int thirde=word2.indexOf("er");
int fourthe=word2.indexOf("es");
        System.out.println("s1 = " + s1);
        System.out.println("secondf = " + secondf);
        System.out.println("firste = " + firste);
        System.out.println("seconde = " + seconde);
        System.out.println("thirde = " + thirde);
        System.out.println("fourthe = " + fourthe);


    }









}
