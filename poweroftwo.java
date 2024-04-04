/*power of tow without modulus but with bit */
/* approach is -: brian kernighans algorithm */

import java.util.Scanner;
public class poweroftwo {
    static boolean power(int n ){
        return (n!=0)&&((n&(n-1))==0);

    }
    public static void main (String args[]){
        /*int n = 6;*/
        Scanner aa = new Scanner (System.in); /* if we direct take the integer use 11 line and remove the 12-14 line */
        System.out.println("Enter a number");
        int n = aa.nextInt();
        System.out.println(power(n));
    }
}
