public class CalculatePower {
    public static void main(String[] args) {
        int num = 19;
        int pow = 5;

        System.out.println(num + "^" + pow + " is :: " + power(num, pow));
        System.out.println("");
        System.out.println(num + "^" + pow + " is :: " + effPower(num, pow));
        System.out.println("");
        System.out.println(num + "^" + pow + " is :: " + powerIterative(num, pow));
    }

    public static int power(int num, int pow) {
        int value = 1;

        for (int i = 1; i <= pow; i ++) {
            value *= num;
        }

        return value;
    }

//    based on the idea
//    3 ^ 10 = 3 ^ 8 * 3 ^ 2
//    this is similar to binary representation of power
//    here power is 8 and 2 = > 1010 (binary)

    public static int powerIterative(int num, int pow) {
        int result = 1;
        while (pow > 0) {
            if(pow % 2 != 0) {
                result = result * num;
            }
            pow = pow/2;
            num = num * num;
        }

        return result;
    }

    public static int effPower(int num, int pow) {
        if (pow == 0) {
            return 1;
        }

        int temp = effPower(num, pow/2);
        temp = temp * temp;

        if (pow % 2 == 0) {
            return temp;
        } else {
            return num * temp;
        }
    }
}
