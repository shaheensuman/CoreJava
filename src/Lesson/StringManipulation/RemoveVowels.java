package Lesson.StringManipulation;

/**
 * Created by jahangir shaheen on 8/23/2017.
 */
public class RemoveVowels {
    public static void methodOne(){
        String str=" java is java but javascript is not java language";
       String newString=str.replaceAll("[AEIOUaeiou]","");
        System.out.println(newString);
    }


    public static void main(String[] args) {
        methodOne();

    }
}
