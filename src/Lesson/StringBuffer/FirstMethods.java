package Lesson.StringBuffer;

/**
 * Created by jahangir shaheen on 8/20/2017.
 */
public class FirstMethods {
    public static void main(String[] args) {
        String one="What Do You Know About Me";
        StringBuffer two=new StringBuffer("What Do You Know ");
        StringBuffer three=new StringBuffer("Welcome to Dhaka");
        // String append() method concatenates the given argument with this string
        System.out.println(two.append("About Me"));
        //***************************************************************************************
        //insert() method inserts the given string with this string at the given position.
        //System.out.println(two.insert(2,"Ab"));
       // System.out.println(two.insert(15,"MN"));
        //***************************************************************************************
        //replace() method replaces the given string from the specified beginIndex and endIndex.
        System.out.println(two.replace(3,13,"java"));
        //************************************************************************************
        //delete() method of StringBuffer class deletes the string from the specified beginIndex to endIndex.
        System.out.println(two.delete(2,4));
        // String reverse() method of StringBuilder class reverses the current string.
        System.out.println(three.reverse());
    }
}
