import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());

        // using compareTo() can compare the strings lexicographical order
        if(A.compareTo(B)>0) {
            System.out.println("Yes");
        }
        else System.out.println("No");

        /* Here we first convert the first letter of the first string into a Upper case
        A.substring(0, 1) will make the first letter to upper case and then concatenate remaining substring using A.substring(1)
        In (0, 1) range, 0 is inclusive and 1 is exclusive
        Similarly we do it for another string and then concatenate both the strings
        Had to go through Java Strings materials to know how strings can be used differently */

        System.out.println(A.substring(0, 1).toUpperCase()+A.substring(1)+" "+B.substring(0, 1).toUpperCase()+B.substring(1));

    }

}

