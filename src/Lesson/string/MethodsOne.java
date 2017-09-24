package Lesson.string;

/**
 * Created by jahangir shaheen on 8/20/2017.
 */
public class MethodsOne {
    public static void main(String[] args) {
        String one="What Do You Know About Me";//creat by string literal
        String two=new String("What Do You Know About Me");//creat by "new"keyword
        String three="Welcome to Dhaka";
        String four="  i am in usa  ";
        String five="";//empty string.
        String six="My name";
        String seven="my name";
        String eight="jahangir";
        //returns string in uppercase
        System.out.println(one.toUpperCase());
        //returns string in lowercase
        System.out.println(two.toLowerCase());
        // string trim() method eliminates white spaces before and after string.
        System.out.println(four.trim());
       // endsWith() method checks if this string ends with given suffix.
        // It returns true if this string ends with given suffix else returns false.
        System.out.println(two.endsWith("e"));
       // startsWith() method checks if this string starts with given prefix.
        // It returns true if this string starts with given prefix else returns false.
        System.out.println(four.trim().startsWith("i"));//return true bcoz of "trim()
        System.out.println(four.startsWith("i"));// false due to space before 'i'.
        //charAt() method returns a char value at the given index number.
        System.out.println(one.charAt(5));//index starts from 0 not 1.
        //StringIndexOutOfBoundsException : if index is negative value or greater than this string length.
       // System.out.println(three.charAt(90));//index out of boundarsException at runtime.
        System.out.println(eight);
        eight="hello world";
        System.out.println(eight);
        System.out.println(eight.replace("jahangir","hello world"));

    }
}
