package Warmup1;

public class bigLetters {
    public String endUp(String str) {
if (str.length()<=3)return str.toUpperCase();
else {
    int x=str.length()-3;
    String front=str.substring(0,x-1);
    String back=str.substring(x,str.length()-1);
    return front+back.toUpperCase();
}
    }
}
