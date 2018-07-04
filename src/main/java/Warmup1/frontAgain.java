package Warmup1;

public class frontAgain {
    public static String front22(String str) {
        if (str.length() < 3) return str + str + str;
        String firsTwo = str.substring(0, 2);
        return firsTwo + str + firsTwo;
    }

}
