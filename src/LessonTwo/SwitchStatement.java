package LessonTwo;

/**
 * Created by jahangir shaheen on 9/9/2017.
 */
public class SwitchStatement {
    public static void main(String[] args) {
        int age=4;
        switch (age){
            case 1:
                System.out.println("you are zarif");
                break;
            case 2:
                System.out.println("you are Zayan");
                break;
            case 3:
                System.out.println("you are shaheen");
                break;
            default:
                System.out.println("Not in the list");
        }
    }
}
