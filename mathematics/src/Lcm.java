public class Lcm {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;

        System.out.println("LCM of " + a + " and " + b + " is " + naiveLCM(a, b));
        System.out.println("LCM of " + a + " and " + b + " is " + bestLCM(a, b));
    }

//    best approach
//    a * b = gcd(a, b) * lcm(a, b);
    public static int bestLCM(int a, int b) {
        return (a * b)/euclideanGCD(a, b);
    }

    public static int euclideanGCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return euclideanGCD(b, a % b);
    }

    public static int naiveLCM(int a, int b) {
        int res = Math.max(a, b);

        while (true) {
            if (res % a == 0 && res % b == 0) {
                return res;
            }

            res ++;
        }
    }
}
