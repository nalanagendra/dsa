public class PrimeFactors {
    public static void main(String[] args) {
        int number = 11;
        printPrimeFactors(number);
        System.out.println("");
        printPrimeFactorsEff(number);
    }

//    Efficient way
    public static void printPrimeFactorsEff(int n) {
        if (n < 1) return;

        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n/2;
        }

        while (n % 3 == 0) {
            System.out.print(3 + " ");
            n = n/3;
        }

        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }

            while (n % (i + 2) == 0) {
                System.out.print((i + 2) + " ");
                n = n / (i + 2);
            }
        }

        if (n > 3) {
            System.out.print(n);
        }
    }

    public static void printPrimeFactors(int n) {
        for (int i = 2; i <= n; i ++) {
            if (isPrime(i)) {
                int x = i;

                while (n % x == 0) {
                    System.out.print(i + " ");
                    x = x * i;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        if (n == 2 || n == 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
