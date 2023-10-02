public class Calculation {
    public static int gcd(int a, int b){
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }
        if (a < 0) {
            a = -a;
        }
        if (b < 0) {
            b = -b;
        }
        while (a != b) {
            if (a > b) {
                a -= b;
            }
            else {
                b -= a;
            }
        }
        return a;
    }
}