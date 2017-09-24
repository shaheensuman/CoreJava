package LessonThree;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by jahangir shaheen on 9/7/2017.
 */
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> firstList=new LinkedList<>();
        List<String> secondList=new LinkedList<>();
        firstList.add("jahangir");
        firstList.add(1,"imtiaz");
        System.out.println(firstList);
        firstList.addFirst("shaheen");
        System.out.println(firstList);
    }
}
