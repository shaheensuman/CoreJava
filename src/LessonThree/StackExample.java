package LessonThree;

import java.util.Stack;

/**
 * Created by jahangir shaheen on 9/18/2017.
 */
public class StackExample {
    public static void main(String[] args) {
        String example="Java is java but Javascript is not java";
        char[]charray=example.toCharArray();
        Stack<Character> first=new Stack<>();
        for(Character ch:charray){
            first.pop();
        }
        System.out.println(first.peek());
    }
}
