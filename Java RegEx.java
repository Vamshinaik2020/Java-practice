import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

/* At first had no idea, then went on to read about RegEx and different Syntax of Regex
Used "[]" for declaring the range of numbers we wanted to choose for a particular IP address, "|" or operator for choosing any of the given range of numbers.
In the problem the IP addresses were divided into many ranges for single digit [0-9], for double digit [0-9][0-9], for triple digit upto 199 used (0|1)[0-9][0-9]
for (200-249) used 2[0-4][0-9] and finally for the range of (250-255) used 25[0-5]



*/
class MyRegex { String zeroTo255 = "([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])";
    public String pattern = zeroTo255 + "." + zeroTo255 + "." + zeroTo255 + "." + zeroTo255; }
