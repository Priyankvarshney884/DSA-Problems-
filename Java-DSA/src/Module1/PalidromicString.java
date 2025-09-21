package Module1;

import java.util.Scanner;

public class PalidromicString {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();


        int n= s.length();
        int i =0;
        boolean palindrome = true;

        while(i<n)
        {
            if(s.charAt(i)!=s.charAt(n-1))
            {
                palindrome= false;
                break;
            }
            i++;
            n--;

        }
        System.out.println(palindrome);
    }
}
