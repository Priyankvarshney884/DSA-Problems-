package Module1;

import java.util.Scanner;

public class UniqueElement {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];

        for(int i=0;i< n ;i++)
        {
            ar[i] = sc.nextInt();
        }

        // call helper function to find unique element in array
        int uniqueVal = Helper(ar);
        System.out.println(uniqueVal);
    }
    public static int Helper(int[] ar)
    {
        int unele = 0;

        for(int i : ar)
        {
            unele^=i;
        }
        return unele;
    }
}
