package assignment1;

public class lab_1_1 {

    public static void main(String[] args) {

        String name = "\u09B0\u09C7\u099C\u09BE\u0989\u09b2";
        String thumsupEmoj ="\uD83D\uDC4D";
        String result="Hi"+ thumsupEmoj +","+"my name is\""+name+"\""+".";
        System.out.println( result);
        String strmsg = " Explanation : The size of the string result is 24, which includes the characters \"Hi\",\n" +
                "           a thumbs up emoji, a comma, the phrase \"my name is\", the Bengali name \"রেজাউল\",\n" +
                "          double quotes,  with each character occupying two bytes in Java's UTF-16 encoding.";

        System.out.println("The size of the string is : " +result.length());

        System.out.println(strmsg);









        //রেজাউল
        // My Native language is Bengali
        //Unicode Character “ে” (U+09C7)
        //Unicode Character “র” (U+09B0)
        //Unicode Character “জ” (U+099C)
        //Unicode Character “া” (U+09BE)
        //Unicode Character “উ” (U+0989)
        //Unicode Character “ল” (U+09B2)
        // Hi �, my name is “Жава”.

    }
}
