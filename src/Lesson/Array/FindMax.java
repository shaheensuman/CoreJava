package Lesson.Array;

/**
 * Created by jahangir shaheen on 8/21/2017.
 */
public class FindMax {
    public static void main(String[] args) {
        int []score= {25,30,100,10,45,22,67,89,125};
        for (int i=0;i<score.length;i++){
            System.out.println(score[i]);

        }
        //finding max
        int max=score[0];
        for (int i=0;i<score.length;i++){
            if(score[i]>max){
                max=score[i];
            }

        }
        System.out.println( " max is: "+max);

        //finding min
        int min=score[0];
        for (int i=0;i<score.length;i++){
            if(score[i]<min){
                min=score[i];
            }

        }
        System.out.println( " min is: "+min);
    }

}

