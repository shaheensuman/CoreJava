package Lesson.string;

/**
 * Created by jahangir shaheen on 8/20/2017.
 */
public class MethodsThree {
    public static void main(String[] args) {
        String one="What Do You Know About Me";
        String five="";

    //indexOf() method returns index of given character value or substring. If it is not found, it returns -1.
        System.out.println(one.indexOf("t"));//index starts from 0.
        System.out.println(one.indexOf("Know"));//index of sub string.
        System.out.println(one.indexOf("Know",2));//know is only one time
        //**************************************************************************
        //boolean isEmpty() method checks if this string is empty.true if length is 0 otherwise false.
        System.out.println(one.isEmpty());
        System.out.println(five.isEmpty());
        //*********************************************************************************
        // static string join() method returns a string joined with given delimiter.
       // delimiter : char value to be added with each element.elements : char value to be attached with delimiter
        String eight=String.join("-","What","Do","Know");
        System.out.println(eight);
        //************************************************************************************************
        //lastIndexOf() method returns last index of the given character value or substring.
        // If it is not found, it returns -1
        System.out.println(one.lastIndexOf("Know"));//sub string
        System.out.println(one.lastIndexOf('A'));// character
        //****************************************************************************
        // int length() method length of the string. It returns count of total number of characters.
        System.out.println(one.length());
        //************************************************************************************************
        //string replace() method returns a string replacing all the old char or CharSequence to new char or CharSequence.
        System.out.println(one.replace('o','e'));//change all old characters
        System.out.println(one.replace("ou","kk"));//change all "ou" to "kk".
        //******************************************************************************************
        /*string replaceAll() method returns a string replacing all the sequence of
         characters matching regex and replacement string */
        System.out.println(one.replaceAll("Do","ku"));
        System.out.println(one.replaceAll("\\s",""));//delete all white spaces.

    }
}
