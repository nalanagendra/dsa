import java.util.Arrays;

public class PrintPrimes {
    public static void main(String[] args) {
        int number = 23;
        printPrimesInRange(number);
        System.out.println("");
        sieveOfEratosthenes(number);
        System.out.println("");
        sieveOfEratosthenesOpt(number);
    }

    public static void sieveOfEratosthenesOpt(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);

        for (int i = 2; i <= n; i ++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
//                as the numbers are composite and other values are considered by previous loops
                for (int j = i * i; j <= n; j += i) {
                    primes[i] = false;
                }
            }
        }
    }

    public static void sieveOfEratosthenes(int n) {
        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);

        for (int i = 2; i * i < n; i ++) {
            if (isPrime(i)) {
                for (int j = 2 * i; j <= n; j += i) {
                    primes[i] = false;
                }
            }
        }

        for (int i = 2; i <= n; i ++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printPrimesInRange(int n) {
        for (int i = 2; i <= n; i ++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n <= 1) return false;

        if (n == 2 || n == 3) return true;

        if (n % 2 == 0 || n % 3 == 0) return false;

        for (int i = 5; i * i < n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
