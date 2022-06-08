import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidation {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the mobile number:");
       String phNumber = input.nextLine();
       validMobileNumber(phNumber);
    }
    public static void validMobileNumber(String str)
    {
        Pattern pattern = Pattern.compile("(0/91)?[7-9][0-9]{9}");
        Matcher match = pattern.matcher(str);
        if((match.find() && match.group().equals(str)))
            System.out.println("Valid Number");
        else
            System.out.println("Not a valid number");
    }
}
