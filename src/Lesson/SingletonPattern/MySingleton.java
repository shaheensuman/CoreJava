package Lesson.SingletonPattern;

/**
 * Created by jahangir shaheen on 8/27/2017.
 */
public class MySingleton {
    static  MySingleton Instance=null;
    static  int  x=10;

    //constructor is private so cant use out the class.
    private MySingleton(){}
    //factory method provide the instance of that class.
    public static MySingleton getInstance(){
        if (Instance==null){
            Instance=new MySingleton();
        }return Instance;//return the class instance.
    }

    public static void main(String[] args) {
        MySingleton a=MySingleton.getInstance();
        MySingleton b=MySingleton.getInstance();
        a.x=a.x+20;
        System.out.println(a.x);
        System.out.println(b.x);//both cases the result is same.


    }
}
