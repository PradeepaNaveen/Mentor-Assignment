/* o/p:  n = 5
  1234554321
  1234  4321
  123    321
  12      21
  1        1
 */
import java.util.*;
public class HollowVShapedNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int n = input.nextInt();
        int space=0,m=1;
        int k=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2*n;j++)
            {
                if(j<n-i)
                    System.out.print(k++);
                else if(m<=space)
                {
                    System.out.print(" ");
                    m++;
                }
                else
                {
                    System.out.print(--k);
                }
            }
            System.out.println(" ");
            space+=2;
            k=1;m=1;
        }
    }
}
