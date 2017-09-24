package Lesson.StringManipulation;

/**
 * Created by jahangir shaheen on 8/21/2017.
 */
public class CharacterOccurance {
    public static void methodOne(){//without for loop
        String string= " java is java but java script is not java";
      //  char ch='a';
        int chLength=string.length()-string.replace("a","").length();
        System.out.println("Total number of character v in this word is: "+chLength);
    }
    public static void main(String[] args) {
        methodOne();

    }
}
