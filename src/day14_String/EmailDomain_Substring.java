package day14_String;

public class EmailDomain_Substring {

    public static void main(String[] args) {
        String email="Cydeo.school@gmail.com";
        int begin=email.indexOf("@")+1;
        int ending=email.lastIndexOf(".");
        String domain=email.substring(begin,ending );

        System.out.println(domain);

    }



}
