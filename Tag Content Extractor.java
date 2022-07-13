import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases>0){
            String line = in.nextLine();

            boolean matchFound = false;
            String regex = "<(.+)>([^<]+)</\\1>";
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(line);

            while(m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if(!matchFound){
                System.out.println("None");
            }
            testCases--;
        }
    }
}


            /*
            First thought i got is to divide the input line into three substrings anfd give them regex, I tried it by declaring both the tags as start and end, and the middle substring as line to be extracted. Used boolean expression and If condition to check the pattern, But the solution didnt work where I got every input line ouput as NONE

            Then again thought of changing the Regular Eexpression. wrote a regex(<[a-zA-Z0-9]>) but which didnt work out for all test cases because in test cases there are space in between tags
            finally came up with regex for first tag, <(.+)> --> where it represents first tag and it can be of any character and can repeate once or more times. this is group(1)

            ([^<]+) --> represents second group where the text can be of anything but not "<" symbol
            and finally </\\1> the last group, end tag where it backtracks the first tag and uses the text in it

            Used while loop to find out the pattern and print out the group(2) which is our required output
            and if the mact not found we will print out None which is donein the if loop

            */
