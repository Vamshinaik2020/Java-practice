import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        /* using S.substring(start, end) to print out the asked output
         (start, end) --> start is inclusive and end is exclusive
         Used substrings in Java String Introduction, same knowledge of substring          is applied here to print the specific substring given the range of start          and end
         */

        System.out.println(S.substring(start, end));
    }
}

