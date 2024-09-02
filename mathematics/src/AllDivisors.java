public class AllDivisors {
    public static void main(String[] args) {
        int num = 100;
        printAllDivisors(num);
        System.out.println();
        printAllDivisorsEff(num);
    }

    public static void printAllDivisorsEff(int n) {
        int i;
        for (i = 1; i * i < n ; i ++) {
            if (n % i == 0)
                System.out.print(i + " ");
        }
// stats from sqrt(n)
        for (; i >= 1; i --) {
            if (n % i == 0)
                System.out.print((n/i) + " ");
        }
    }

//    naive
    public static void printAllDivisors(int n) {
        for (int i = 1; i <= n; i ++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
