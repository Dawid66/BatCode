package Warmup1;

public class welcome {
    public boolean startHi(String str) {

if (str.length()<2)return false;
        String hi=str.substring(0,2);
if( hi.equals("hi"))return true;
else return false;
    }

}
