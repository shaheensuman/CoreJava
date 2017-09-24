package Lesson.Array;

/**
 * Created by jahangir shaheen on 8/20/2017.
 */
public class ArryOne {
    public static void methodOne(){
        int[] ar;//declare array;
        ar = new int[5];//allocate memory for 3 integers.

        // initialize elements of Array.
        ar[0] = 5;
        ar[1] = 10;
        ar[2] = 15;
        ar[3] = 20;
        ar[4] = 25;
        //accessing array elements.
        for (int i = 0; i < ar.length; i++) {
            System.out.println("index of " + i + " array element is " + ar[i]);
        }

    }
    public static void methodTwo(){
        int[] ar;
        ar = new int[3];
        ar[0] = 5;
        ar[1] = 10;
        ar[2] = 15;
        System.out.println("out of boundary example: "+ar[5]);
        //result : ArrayIndexoutOfBoundException
    }
    public static void  methodThree(){
        Student[] st=new Student[3];
    }
    public static void main(String[] args) {
        Student[] ar=new Student[3];
       int l= ar.length;
        System.out.println(l);

       //methodOne();
      // methodTwo();
    }
    public void anotherArray(){
        
    }
}
