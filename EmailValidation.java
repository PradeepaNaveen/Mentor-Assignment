import java.util.*;
import java.util.regex.Pattern;

public class EmailValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Email Address:");
        String emailAddress = input.next();
        validateEmail(emailAddress);

    }
    public static void validateEmail(String emailAddress)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-] + (?:\\\\.[a-zA-Z0-9_+&*-]\n" +
                "+ )*@(?:[a-zA-Z0-9-]+\\\\.) + [a-zA-Z]{2, 7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        if(pattern.matcher(emailAddress).matches())
            System.out.println("Valid");
        else
            System.out.println("Invalid");
    }
}
