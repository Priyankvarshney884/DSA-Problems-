package Module1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumericStair {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for(int i=1 ;i<=n;i++)
        {
            ArrayList<Integer> ar = new ArrayList<>();
            for(int j=1;j<=i;j++)
            {
                ar.add(j);

            }
            arr.add(ar);
        }

        for(ArrayList res : arr )
        {
            System.out.print(res);
        }

    }
}
