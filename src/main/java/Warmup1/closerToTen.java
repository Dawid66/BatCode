package Warmup1;

import static java.lang.Math.abs;

public class closerToTen {
    public int close10(int a, int b) {
int x=abs(10-a);
int y=abs(10-b);
if (x>y)return b;
else if ((y>x))return a;
else return 0;
    }
}
