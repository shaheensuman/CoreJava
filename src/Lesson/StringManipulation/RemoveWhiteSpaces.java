package Lesson.StringManipulation;

/**
 * Created by jahangir shaheen on 8/23/2017.
 */
public class RemoveWhiteSpaces {
    public static void methodOne(){
        String str=" java is java    but javascript is    not java   language";
        String strWS=str.replaceAll("\\s","").trim();
        System.out.println(strWS);

    }
    public static void methodTwo(){
        String str=" java is java    but javascript is    not java   language";
        char []ca=str.toCharArray();
        StringBuffer sb=new StringBuffer();
        for(Character c:ca){
            if (c!=' '&& c!='\t'){
                sb.append(c);

            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        methodOne();
        methodTwo();

    }
}
