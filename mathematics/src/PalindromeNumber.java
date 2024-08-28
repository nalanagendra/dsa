public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 12222441;
        System.out.println(isPalindrome(num));
    }

    public static boolean isPalindrome(int n) {
        int temp = n;
        int rev = 0;
        while(temp > 0) {
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }

        return (n == rev);
    }

}
