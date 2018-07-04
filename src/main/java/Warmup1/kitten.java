package Warmup1;
public class kitten {
    public static String missingChar(String str, int n) {
   String a = str.substring(0,n);
   String b = str.substring(n+1,str.length());
   return a+b;
    }
}
