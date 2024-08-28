public class CountDigits {
    public static void main(String[] args) {
        int number = 1001234;
        System.out.println("Total digits in " + number + " is " + iterativeCountDigits(number));

        System.out.println("Total digits in " + number + " is " + recursiveCountDigits(number));

        System.out.println("Total digits in " + number + " is " + logarithmicCountDigits(number));
    }

//    iterative approach
    public static int iterativeCountDigits(int n) {
        int count = 0;
        while(n > 0) {
            count ++;
            n = n/10;
        }
        return count;
    }

//    recursive approach
    public static int recursiveCountDigits(int n) {
        if (n <= 0) {
            return 0;
        }

        return 1 + recursiveCountDigits(n/10);
    }

//    logarithmic solution
    public static int logarithmicCountDigits(int n) {
        return (int)Math.floor(Math.log10(n) + 1);
    }
}
