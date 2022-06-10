import java.util.*;
public class AlphabetDiamond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int n = input.nextInt();
        char ch ='A';
        int k=n-1;
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<n;j++)
          {
             if(j<k)
                 System.out.print(" ");
             else {
                 System.out.print(ch + " ");
                 ch++;
             }
          }
          ch = 'A';
          System.out.println(" ");
          k--;
        }
        ch = 'A';
        k=1;
        for(int i=n-1;i>0;i--)
        {
            for(int j=0;j<n;j++)
            {
                if(j<k)
                    System.out.print(" ");
                else {
                    System.out.print(ch + " ");
                    ch++;
                }
            }
            ch = 'A';
            System.out.println(" ");
            k++;
        }
    }
}
   /*o/p: n=4
           A
          A B
         A B C
        A B C D
         A B C
          A B
           A
    */