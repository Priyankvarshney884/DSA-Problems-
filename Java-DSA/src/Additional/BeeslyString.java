package Additional;

import java.util.Scanner;

//Mr. Jim likes playing with strings a lot, so Mrs. Pam gifted him a string
// A which has some very unique magical powers. The string consists of lowercase latin letters 'p','a' and 'm' only.
public class BeeslyString {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        boolean isEmpty = true;

        int ca =0 , cm = 0, cp =0;

        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)=='a')
            {
                ca++;
            }
            else if (s.charAt(i)=='p')
            {
                cp++;
            }
            else
            {
                cm++;
            }


        }
        if(ca+cp !=cm)
        {
            isEmpty= false;
        }

        System.out.println(isEmpty);
    }
}
