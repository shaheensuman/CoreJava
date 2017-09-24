package Lesson.StringManipulation;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by jahangir shaheen on 8/23/2017.
 */
public class DuplicateCharacters {
    public static void methodOne(){
        String str="aaaabbbbcc";
        System.out.println(str.length());
        HashMap<Character, Integer> charOcccu=new HashMap<>();
        char[]charArray=str.toCharArray();
        for(char ch:charArray){
            if(charOcccu.containsKey(ch)){
                charOcccu.put(ch,charOcccu.get(ch)+1);
            }else {
                charOcccu.put(ch,1);
            }

        }
        System.out.println(charOcccu);

       // System.out.println( "the number of g in the string is "+charOcccu.get('g'));//single cote for characters.
    }
    public static void main(String[] args) {
      methodOne();
    }
}

