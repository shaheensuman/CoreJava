package Lesson.Two;

/**
 * Created by jahangir shaheen on 5/19/2017.
 */
public class FourthClassDemo {
    public static void main(String[] args) {

    }
    public void delayFor(int milliseconds){
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}