package stringExercises;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;
import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.register;

public class String12 {
    public String makeAbba(String a, String b) {
        return a + b + b + a;
    }

    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "<" + tag + "/>";
    }

    public static String makeOutWord(String out, String word) {
        int x = out.length();
        String first = out.substring(0, 2);
        String second = out.substring(2, x);
        return first + word + second;
    }

    public String extraEnd(String str) {
        String lastTwo = str.substring(str.length() - 2, str.length());
        return lastTwo + lastTwo + lastTwo;
    }

    public String firstTwo(String str) {
        if (str.length() < 2) return str;

        else {
            String extraStart = str.substring(0, 2);
            return extraStart;
        }
    }

    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String comboString(String a, String b) {
        if (a.length() < b.length()) return a + b + a;
        if (a.length() > b.length()) return b + a + b;
        return a;
    }

    public String nonStart(String a, String b) {
        return a.substring(1) + b.substring(1);
    }

    public String left2(String str) {
        if (str.length() < 3) return str;
        String front = str.substring(2);
        String back = str.substring(0, 2);
        return front + back;
    }

    public String right2(String str) {
        if (str.length() < 3) return str;
        String front = str.substring(str.length() - 2);
        String back = str.substring(0, str.length() - 2);
        return front + back;
    }

    public String theEnd(String str, boolean front) {

        if (front == true) return str.substring(0, 1);
        else return str.substring(str.length() - 1, str.length());
    }

    public String withouEnd2(String str) {
        if (str.length() < 3) return "";
        else return str.substring(1, str.length() - 1);
    }

    public String middleTwo(String str) {
        if (str.length() < 1) return str;
        else return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
    }

    public boolean endsLy(String str) {
        if (str.length() < 2) return false;
        if (str.substring(str.length() - 2).equals("ly")) return true;
        else return false;
    }

    public String nTwice(String str, int n) {
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    public String twoChar(String str, int index) {
        if ((str.length() < index - 1) || (index < 0)) return str.substring(0, 3);
        else return str.substring(index, index + 2);
    }

    public String middleThree(String str) {
        if (str.length() < 4) return str;
        else return str.substring((str.length() / 2) - 1, (str.length() / 2) + 2);
    }

    public boolean hasBad(String str) {
        if (str.length() < 3) return false;
        if (str.length() == 3 && !str.equals("bad")) return false;
        if (str.substring(0, 3).equals("bad")) return true;
        if (str.substring(1, 4).equals("bad")) return true;
        else return false;
    }

    public String atFirst(String str) {
        if (str.length() == 0) return "@@";
        if (str.length() == 1) return str + "@";
        else if (str.length() == 2) return str;
        else return str.substring(0, 2);
    }

    public String lastChars(String a, String b) {
        if (a.equals("")) a = "@";
        if (b.equals("")) b = "@";
        return "" + a.charAt(0) + b.charAt(b.length() - 1);
    }

    public String conCat(String a, String b) {
        if (a.length() == 0 || (b.length() == 0)) return a + b;
        else if (a.charAt(a.length() - 1) == b.charAt(0)) return a + b.substring(1);
        else return a + b;
    }


    public String lastTwo(String str) {
        if (str.length() < 2) return str;
        if (str.length() == 2) return "" + str.charAt(1) + str.charAt(0);
        return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length() - 2);

    }

    public String seeColor(String str) {
        if (str.length() < 3) return "";
        else if (str.substring(0, 3).equals("red")) return "red";
        else if (str.substring(0, 4).equals("blue")) return "blue";
        else return "";
    }

    public boolean frontAgain(String str) {
        if (str.length() < 2) return false;
        else if (str.substring(0, 2).equals(str.substring(str.length() - 2))) return true;
        else return false;
    }

    public String extraFront(String str) {
        if (str.length() < 2) return str + str + str;
        else return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);

    }

    public String without2(String str) {
        if (str.length() < 2) return str;
        String front = str.substring(0, 2);
        String back = str.substring(str.length() - 2);
        if (front.equals(back)) return str.substring(2);
        else return str;
    }

    public String deFront(String str) {
        if (str.charAt(1) == 'b' && str.charAt(0) == 'a') return str;
        else if (str.charAt(0) == 'a') return "" + str.charAt(0) + str.substring(2);
        else if (str.charAt(1) == 'b') return "" + str.substring(1);

        else return str.substring(2);
    }

}