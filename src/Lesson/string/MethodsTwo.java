package Lesson.string;

/**
 * Created by jahangir shaheen on 8/20/2017.
 */
public class MethodsTwo {
    public static void main(String[] args) {
        String one="What Do You Know About Me";//creat by string literal
        String two=new String("What Do You Know About Me");//creat by "new"keyword
        String three="Welcome to Dhaka";
        String four="  i am in usa  ";
        String five="";//empty string.
        String six="My name";
        String seven="my name";
        //compareTo() method compares the given string with current string lexicographically.
        // It returns positive number, negative number or 0.
        System.out.println(one.compareTo(two));//0 coz both are equal
        System.out.println(one.compareTo(three));//3 coz
        System.out.println(one.compareTo(four));
        System.out.println(one.compareTo(five));
        System.out.println(one.compareTo(six));
        System.out.println(six.compareTo(one));
        System.out.println(one.compareTo(seven));//negtive .m is small latter.
        //string concat() method combines specified string at the end of this string. It returns combined string.
        System.out.println(six.concat(seven));//concat with another variable
        System.out.println(three.concat(" is shaheen"));//concat directly.
        //boolean contains() method searches the sequence of characters in this string.
        //It returns true if sequence of char values are found in this string otherwise returns false.
        System.out.println(one.contains("You")); //true coz contains You.
        System.out.println(one.contains("you"));//false coz y is small latter
        System.out.println(one.contains("hello"));//does not exist
        System.out.println(one.contains("Yo"));//true
        //*********************************************************
       // boolean contentEquals() method compares the two given strings based on the content of the string.
        // If any character is not matched, it returns false. If all characters are matched, it returns true.
        System.out.println(one.contentEquals("You"));
        System.out.println(one.contentEquals("you"));
        System.out.println(one.contentEquals("hello"));
        //***********************************************************************************************
        //boolean equalsIgnoreCase()  method
        // returns true if characters of both strings are equal ignoring case otherwise false.
        System.out.println(six.equalsIgnoreCase(seven));
        System.out.println(six.contentEquals(seven));//m is small case

    }
}
