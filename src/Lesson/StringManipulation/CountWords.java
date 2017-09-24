package Lesson.StringManipulation;

/**
 * Created by jahangir shaheen on 8/21/2017.
 */
public class CountWords {
    public static void methodOne(){
        String s1="java is java but java script is not java but now a days javascript is most popular language";

        String[] words = s1.trim().split(" ");
        System.out.println("The total words in the string is: "+words.length);
    }

    public static void main(String[] args) {
        methodOne();
    }
}
