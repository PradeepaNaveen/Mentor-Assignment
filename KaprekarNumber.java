package Hackkerrank;

public class KaprekarNumber {
    public static void main(String[] args) {
        boolean flag = false;
        long leftDigit, rightDigit, t, sum, temp, sqNumber;
        int div;
        int p = 1, q = 99999;
        for (long i = p; i <= q; i++) {
            temp = i;
            div = 1;
            sum = 0;
            while (temp > 0) {
                temp = temp / 10;
                div = div * 10;
            }
            sqNumber = i * i;
            leftDigit = sqNumber / div;
            rightDigit = sqNumber % div;
            sum = leftDigit + rightDigit;
            if (sum == i) {
                if (flag) {
                    System.out.print(" ");
                }
                System.out.print(i);
                flag = true;
            }
        }
        if (!flag)
            System.out.print("INVALID RANGE");
    }
}

