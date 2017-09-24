package LessonThree;

import java.util.ArrayList;

/**
 * Created by jahangir shaheen on 9/7/2017.
 */
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String>firstList=new ArrayList<>();
        firstList.add("zayan");
        firstList.add("zarif");
        firstList.add("shaheen");
        firstList.add("IMTIAZ");
        firstList.add("2");
        System.out.println(firstList);
        System.out.println(firstList.get(2));
        firstList.add(2,"jahangir");
        System.out.println(firstList);
        System.out.println(firstList.get(2));
        System.out.println(firstList.indexOf("shaheen"));
        firstList.remove(3);
        firstList.add(3,"hello World");
        System.out.println(firstList.get(3));
       // System.out.println(firstList.r);
    }
}
