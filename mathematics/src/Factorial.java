public class Factorial {
    public static void main(String[] args) {
        int num = 4;

        System.out.println("Factorial of " + num + " is " + iterativeFactorial(num));

        System.out.println("Factorial of " + num + " is " + recursiveFactorial(num));
    }

//    iterative factorial
    public static int iterativeFactorial(int num) {
        int fact = 1;

        for(int i = num; i > 1; i--) {
            fact = fact * i;
        }

        return fact;
    }

//    recursive factorial
    public static int recursiveFactorial(int num) {
        if (num <= 1) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);
    }
}
