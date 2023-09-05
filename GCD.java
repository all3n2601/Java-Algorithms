public class GCD {

    public static int gcd(int a, int b) {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        int a = 50, b = 12, g;

        g = gcd(a, b);
        System.out.println("GCD(" + a + " , " + b
                + ") = " + g);

    }
}