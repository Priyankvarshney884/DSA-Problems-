package Additional;

import java.lang.classfile.constantpool.IntegerEntry;
import java.util.ArrayList;
import java.util.Scanner;

public class FrequencyCount {
    public static void main(String args[])
    {
        int[] a = {1, 2, 5, 1, 5, 1 };

        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=0;i<a.length;i++)
        {
            int count=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[j]==a[i])
                {
                    count++;
                }
            }
            ar.add(count);
        }

        for(int i : ar)
        {
            System.out.print(i+" ");
        }
    }
}
