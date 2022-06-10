
/* o/p:n=5
1       1
12     21
123   321
1234 4321
123454321
1234 4321
123   321
12     21
1       1
 */
import java.util.*;
public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int n = input.nextInt();
        int lowerSpace = 1, temp = n - 1;
        int space = n - 1, m = 0;
        int k = 1, flag = 0;
        for (int i = 1; i <= n * n; i++) {
            for (int j = 0; j < 2 * n; j++) {
                if (i <= n) {
                    if (j < i)
                        System.out.print(k++);
                    else if (m <= (2 * space - 1)) {
                        m++;
                        System.out.print(" ");
                    } else
                        System.out.print(--k);
                } else {
                    flag = 1;
                    if (j < temp)
                        System.out.print(k++);
                    else if (m <= (2 * lowerSpace - 1)) {
                        System.out.print(" ");
                        m++;
                    } else {
                        System.out.print(--k);
                    }
                }
            }
            System.out.println(" ");
            space--;
            m = 0;
            k = 1;
            if (flag == 1) {
                lowerSpace++;
                temp--;
            }
        }
    }
}
