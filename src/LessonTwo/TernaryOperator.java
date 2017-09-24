package LessonTwo;

/**
 * Created by jahangir shaheen on 9/9/2017.
 */
public class TernaryOperator {
    public static void main(String[] args) {
        int a;
        int b;
         a=25;
         b=(a==10)? 100:200;//a!=10 false so b=200
        System.out.println("value of b is "+b);
        b=(a==25)? 100:200;//a=25 true so b=100
        System.out.println("value of b is "+b);

    }
}
