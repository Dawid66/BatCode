package Warmup1;

public class LastLetter {
   static public String backAround(String str) {
        if (str.length()<=1)return str+str+str;
        char last = str.charAt(str.length()-1);
        return last+str+last;
    }
}
