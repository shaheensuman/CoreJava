package LessonThree;

import java.util.HashMap;

/**
 * Created by jahangir shaheen on 9/11/2017.
 */
public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,Integer> firstMap=new HashMap<>();
        firstMap.put("jahangir",1);
        firstMap.put("imtiaz",2);
        firstMap.put("shaheen",3);
        firstMap.put("imtiaz",4);//duplicate key is not allowed.
        firstMap.put("zarif",3);// duplicate value is allowed
        System.out.println(firstMap);
        for (String name:firstMap.keySet()){//for iteration we need keyset.
            System.out.println(name);

        }
    }
}
