package Lesson.One;

/**
 * Created by jahangir shaheen on 5/28/2017.
 */
public class ClassDemo {
   static int x=5;


    public static void main(String[] args) {
        System.out.println("hi");
        System.out.println(add(10));
    }
    public static int add(int y){
        int z=0;
        z=x+y;
        return z;
    }
}
