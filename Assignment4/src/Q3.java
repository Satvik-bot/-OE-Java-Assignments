import java.util.*;

class Number {
    private double num;

    void setNum(double num) {
        this.num = num;
    }

    boolean isZero() {
        return num == 0;
    }

    boolean isPositive() {
        return num > 0;
    }

    boolean isNegative() {
        return num < 0;
    }

    boolean isOdd() {
        return num % 2 != 0;
    }

    boolean isEven() {
        return num % 2 == 0;
    }

    boolean isPrime() {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    boolean isArmstrong() {
        int originalNumber, remainder, result = 0;

        originalNumber = (int) num;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        return result == num;
    }

    double getFactorial() {
        double ans = 1;
        for (int i = 1; i <= num; i++)
            ans *= i;
        return ans;
    }

    double getSqrt() {
        return Math.sqrt(num);
    }

    double getSqr() {
        return num * num;
    }

    double sumDigits() {
        int ans = 0, number = (int) num;
        while (number > 0) {
            int temp = number % 10;
            ans += temp;
            number = number / 10;
        }
        return ans;
    }

    double getReverse() {
        int number = (int) num, reverse = 0;
        for (; number != 0; number = number / 10) {
            int remainder = number % 10;
            reverse = reverse * 10 + remainder;
        }
        return reverse;
    }

    void listFactor() {
        for (int i = 1; i <= num; ++i) {

            // if number is divided by i
            // i is the factor
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    void dispBinary() {
        Stack<Integer> st = new Stack<>();
        int number = (int) num;
        // Number Should be positive
        while (number > 0) {
            // Pushing numbers inside stack that
            // are divisible by 2
            st.push(number % 2);
            // Dividing number by 2
            number = number / 2;
        }

        // Checking condition whether stack is empty
        while (!(st.isEmpty())) {
            System.out.print(st.pop());
        }
    }
}

public class Q3
{
    public static void main(String[] args)
    {
        Number num = new Number();
        num.setNum(100d);
        System.out.println("isZero: "+num.isZero());
        System.out.println("isPositive: "+num.isPositive());
        System.out.println("isNegative: "+num.isNegative());
        System.out.println("isOdd: "+num.isOdd());
        System.out.println("isEven: "+num.isEven());
        System.out.println("isPrime: "+num.isPrime());
        System.out.println("isArmstrong: "+num.isArmstrong());
        System.out.println("getFactorial: "+num.getFactorial());
        System.out.println("getSqrt: "+num.getSqrt());
        System.out.println("getSqr: "+num.getSqr());
        System.out.println("sumDigits: "+num.sumDigits());
        System.out.println("getReverse: "+num.getReverse());
        num.listFactor();
        num.dispBinary();
    }
}