package Warmup1;

public class FrontNext {
    public static String front3(String str) {
        if (str.length() >= 3) {
            String TheFirstThree = str.substring(0, 3);
            return TheFirstThree + TheFirstThree + TheFirstThree;
        }
        else return str+str+str;
    }
}