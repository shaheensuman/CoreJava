package LessonTwo;

/**
 * Created by jahangir shaheen on 9/11/2017.
 */
public class RecursionExample {
    public static void main(String[] args) {
        System.out.println(recursion(5));
    }
    public static int recursion(int n ){

        if(n==1){
            return 1;
        }else
            return n*recursion(n-1);

    }
}
