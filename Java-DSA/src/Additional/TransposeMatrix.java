package Additional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TransposeMatrix {
    public static void main(String args[])
    {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1,2,3)),
                new ArrayList<>(Arrays.asList(1,2,3)),
                new ArrayList<>(Arrays.asList(1,2,3))
        ));

        // we have to transpose the matrix row to coloumn and colum to row

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        int n = list.size();
        int m = list.get(0).size();

        for(int i =0; i<m;i++)
        {
            ArrayList<Integer> col = new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                int val = list.get(j).get(i);
                col.add(val);
            }
            arr.add(col);
        }

        for(ArrayList ar : arr)
        {
            System.out.print(ar);
        }

    }
}
