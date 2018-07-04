package Warmup1;

public class frontBack {
    public static String frontBack123(String str) {
        if(str.length()<=1)return str;
    String mid = str.substring(1,str.length()-1);
    return str.charAt(str.length()-1)+mid+str.charAt(0);
    }
}
