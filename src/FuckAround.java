import java.util.Scanner;

public class FuckAround {
    public static void main(String[] args)
    {
//        int i = '2' + '3';
//        char j = 2 + 'a';
//        System.out.println(j +  " " + (int)j);
//
//        char a = 'a' + 2;
//        System.out.println(a);
//
//        int k = 97;
//        System.out.println(k + " " + (char)k);
//
//        char tester = 'a';
//        System.out.println(Character.isLetterOrDigit('a'));

        String message = "Welcome to Java";
        System.out.println(message);

        String sentence1 = "My name is Dylan Bozada";
        String sentence2 = " AND HERE WE GO";
        String s3 = sentence1.concat(sentence2);
//        System.out.println(sentence1.length());
//        System.out.println(sentence1.charAt(12));
//        System.out.println(sentence1.concat(sentence2).toLowerCase());
//        System.out.println(sentence2.toLowerCase());


//        System.out.println(s3);
//        System.out.println(s3.contains("name"));
//
//        String string1 = "Hello World";
//        String string2  = string1;
//        String string3 = "What is up";
//        String string4 = "What is up ";
//
//        if (string1 == string2) {
//            System.out.println("They are equal");
//        }
//        else {
//            System.out.println("They are not equal");
//
//        }
//
//        if (string3.equals(string4.trim())) {
//            System.out.println("Equal");
//        }
//        else {
//            System.out.println("Not equal");

        int intValue = Integer.parseInt("123");
        System.out.println(intValue + 7);

        String s = 123456789 + "";
        System.out.println(s.charAt(1));
        System.out.println(s.indexOf('8'));

        String sent1 = "Welcome to Java";
        String sent2 = "Programming is fun";
        String sent3 = "Welcome to Java";
        Boolean isEqual = isEqual = sent1.equals(sent2);


        System.out.println(sent1 == sent3);
        isEqual = sent1.equals(sent2);
        System.out.println(isEqual);

        int e = sent1.compareTo(sent2);
        System.out.println(e);




        }




}
