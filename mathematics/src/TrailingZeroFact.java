public class TrailingZeroFact {
    public static void main(String[] args) {
        int num = 251;

//        long fact = factorial(num);
//        System.out.println("Factorial of " + num + " is " + fact);
//        System.out.println("Trailing zeroes in " + fact + " is " + trailingZero(fact));

        System.out.println("Trailing zeroes in factorial of " + num + " is " + optimizedTrailingZero(num));
    }

    public static long factorial(long num) {
        long fact = 1;
        for (long i = 2; i <= num; i ++) {
            fact *= i;
        }

        return fact;
    }

    public static long trailingZero(long fact) {
        long count = 0;

        while (fact > 0) {
            long lastTerm = fact % 10;
            if (lastTerm == 0) {
                count ++;
            } else {
                break;
            }
            fact = fact / 10;
        }

        return count;
    }

/*  if a given number is some large n
    to compute the factorial we write as
    1 * 2 * 3 * 4 * 5 * ........ * n
    if we notice here we get zero(0) in the end if we multiply (2 * 5)
    if we are able to calculate the number of (2 * 5) we will get trailing zeros
    but some number like 25, 125, have (5 * 5) , (5 * 5 * 5)
    so we must consider those too.

    trailing zeroes as [1/5, 1/25, 1/125 .....] * n
    where value of each term must be greater than or equal to 1
    Time complexity is theta(log(n)
*/

    public static long optimizedTrailingZero(int n) {
        int count = 0;

        for (int i = 5; i < n; i *= 5) {
            count += n / i;
        }

        return count;
    }


}
