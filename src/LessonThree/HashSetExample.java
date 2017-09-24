package LessonThree;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by jahangir shaheen on 9/11/2017.
 */
public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> firstSet=new HashSet<>();
        firstSet.add("jahangir");
        firstSet.add("imtiaz");
        firstSet.add("shaheen");
        firstSet.add("imtiaz");//duplicate value is not allowed.
        System.out.println(firstSet);//dont follow order.

        for (String name:firstSet){
            System.out.println(firstSet);
        }
        //iterate through set.
        Iterator<String>name=firstSet.iterator();
        while (name.hasNext()){

            System.out.print(name.next()+"\t");
        }
    }
}
