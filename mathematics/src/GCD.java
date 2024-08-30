public class GCD {
    public static void main(String[] args) {
        int a = 100;
        int b = 12;

        System.out.println("Gcd of " + a + " and " + b + " is :: " + calculateGCD(a, b));
        System.out.println("Gcd of " + a + " and " + b + " is :: " + euclidGCD(a, b));
        System.out.println("Gcd of " + a + " and " + b + " is :: " + optEuclideanGCD(a, b));
    }

    /*
    Optimized Euclidean
    Instead of repeated subtractions we use modulo operator
     */

    public static int optEuclideanGCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return optEuclideanGCD(b , a % b);
    }

/*    Euclidean algo
      Basic idea:
      Let 'b' be smaller than 'a'
      gcd(a, b) = gcd(a-b, b)

      why?
      let 'g' be the GCD of 'a', 'b'
      a = gx, b = gy and gcd(x, y) = 1
      (a - b) = g(x - y);
 */

    public static int euclidGCD(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        return a;

    }


//    naive
    public static int calculateGCD(int a, int b) {
        int gcd = 1;

        for (int i = 2; i <= Math.min(a, b); i ++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }
}
