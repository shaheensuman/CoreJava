package Lesson.StringManipulation;

import java.util.HashMap;
import java.util.Set;

/**
 * Created by jahangir shaheen on 8/22/2017.
 */
public class DuplicateWords {
    public static void methodOne(){
        String originalStr="java is java language but javascript is not java language ";
        String []changedStr=originalStr.split(" ");// put into array after split.
      /* this code is only ck what happen after split.
        for(int i=0;i<changedStr.length;i++){
            System.out.print(changedStr[i]);
        } */


        HashMap<String,Integer> wordCount= new HashMap<>();// create hashmap
        //go through each words
        for(String word:changedStr){
            //System.out.print(word);
            if (wordCount.containsKey(word.toUpperCase())){
                wordCount.put(word.toUpperCase(),wordCount.get(word.toUpperCase())+1);

            }else {
                wordCount.put(word.toUpperCase(),1);
            }
        }
        Set<String>setOfKeys=wordCount.keySet();
        System.out.println(setOfKeys);
        for(String singleKey:setOfKeys){

            if(wordCount.get(singleKey)>1){
                System.out.println(singleKey+ "  :  "+wordCount.get(singleKey));
            }
            else {
                  System.out.println(singleKey+ "  :  "+wordCount.get(singleKey));
            }
        }
    }
    public static void methodTwo(){
        String originalStr="java is java language but javascript is not java language ";
        String []changedStr=originalStr.split(" ");// put into array after split.



    }
    public static void main(String[] args) {
        methodOne();
       // methodTwo();

    }
}
