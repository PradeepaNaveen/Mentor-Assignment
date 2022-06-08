import java.util.*;
public class WordString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String1:");
        String string1 = input.nextLine();
        System.out.print("Enter the String2");
        String string2 = input.nextLine();
        String outString = "";
        for(int i=0;i<string1.length();i++)
        {
           int count =0;
            for(int j=0;j<string2.length();j++)
            {
                if(string1.charAt(i) != string2.charAt(j))
                {
                    count++;
                    if(count ==string2.length())
                      outString +=string1.charAt(i);
                }
            }
        }
        System.out.println(outString + " ");
    }
}
