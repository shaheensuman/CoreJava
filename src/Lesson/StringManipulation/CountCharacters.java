package Lesson.StringManipulation;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by jahangir shaheen on 9/23/2017.
 */
public class CountCharacters {

    public static void countCharacters(String input){

        String  modifiedInput=input.replaceAll(" ","");
        char[]charray=modifiedInput.toCharArray();
        HashMap<Character,Integer>countChar=new HashMap<>();
        for(Character ch:charray){
            if (countChar.containsKey(ch)){
                countChar.put(ch,countChar.get(ch)+1);
            }else {
                countChar.put(ch,1);
            }
        }
        Set<Character> keyset=countChar.keySet();
        for (Character ks:keyset){
            System.out.print(countChar.get(ks)+""+ks+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your string");
        String yourInput=scanner.nextLine();

        countCharacters(yourInput);
    }
}
