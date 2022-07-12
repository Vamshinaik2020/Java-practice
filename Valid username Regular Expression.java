import java.util.Scanner;
class UsernameValidator {
    /*

    Again had to go through Regular Expression tutorials for basics, syntax
    Last time I have done a similar problem where regex for IP address was used, from that knowledge I tried the following regex

    [A-Za-z] -> first character can be anything ranging from a-z or A-Z
    [A-Za-z0-9_] -> remaining characters can be any of the following, can be in the range of a-z or A-Z or 0-9 or "_"
    {7,29} -> is the remaining characters minimum=7 and maximum=29

    Becasue we have already declared/selected the first character in the [A-Za-z], we want the remaining characters, minimum=7 to make the total userName characters 8

    Similarly maximum is 29 because we have already selected the first character from  [A-Za-z]

    We can further reduce [A-Za-z0-9_] to "\w" but for my understanding restricted it to [A-Za-z0-9_]

    */
    public static final String regularExpression =  "[A-Za-z][A-Za-z0-9_]{7,29}";
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}