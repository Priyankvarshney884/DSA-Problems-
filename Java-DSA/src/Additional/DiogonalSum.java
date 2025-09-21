package Additional;

import java.util.ArrayList;
import java.util.Arrays;


// write the code for which can add the diagonal element sum

public class DiogonalSum {
    public static void main(String args[])
    {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>(Arrays.asList(
                new ArrayList<>(Arrays.asList(1,2,3)),
                new ArrayList<>(Arrays.asList(1,2,3)),
                new ArrayList<>(Arrays.asList(1,2,3))
        ));

        int sum=0;
        int n = list.size();
        int m = list.get(0).size();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==j)
                {
                    sum+= list.get(i).get(j);
                }
            }
        }

        System.out.println(sum);
    }
}
