import java.math.BigDecimal;
import java.util.Scanner;

class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        for (int i=0; i<n-1; i++) {
            for (int j=0; j<n-1-i; j++) {

                BigDecimal a = new BigDecimal(s[j]);
                BigDecimal b = new BigDecimal(s[j+1]);

                if (a.compareTo(b) == -1) {
                    String temp = s[j];
                    s[j] = s[j+1];
                    s[j+1] = temp;
                }
            }
        }
/*     Used simple bubble sort method to sort the given integer strings in the descending order.
       First thing came in my mind was to use bubble sort and replace two integer strings with each other accordingly.
       But then this is different case where BigDecimal comes into play
       so used compareTo() method to compare the bigDecimals then replacing two bigDecimals using "temp" variable.
       If the compareTo() method returns -1 then a<b, so they will exchange the values. They perform bubble sort over there
         */

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
