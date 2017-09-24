package Lesson.StringManipulation;

/**
 * Created by jahangir shaheen on 8/20/2017.
 */
public class ReverseString {

    public static void methodOne() {//string buffer method
        String original = "welcome to reverse string";
        String reverse = new StringBuffer(original).reverse().toString();
        System.out.println("\nString before reverse: " + original);
        System.out.println("String after reverse: " + reverse);
    }
    public static void methodTwo(){//iterative method.
        String original="welcome to reverse string";
        System.out.println("original string: "+original);

        char []ca=original.toCharArray();
        for (int i=ca.length-1;i>=0;i--) {
            System.out.print(ca[i]);// not println
        }

    }
    public static void main(String[] args) {
        methodOne();
        methodTwo();


    }

}
