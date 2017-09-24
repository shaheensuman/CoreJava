package Lesson.StringBuilder;

/**
 * Created by jahangir shaheen on 8/20/2017.
 */
public class MethodOne {
    public static void main(String[] args) {
       StringBuilder one=new StringBuilder("What Do You Know ");
        System.out.println(one.append("About Me"));
        System.out.println(one.insert(2,"KK"));
        System.out.println(one.replace(8,15,"YY"));
        System.out.println(one.delete(1,3));
    }
}
