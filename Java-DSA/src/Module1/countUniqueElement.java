package Module1;

import java.util.HashMap;
import java.util.HashSet;

public class countUniqueElement {
    public static void main(String args[])
    {
        int[] ar = {3, 4, 3, 6, 6};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i =0;i<ar.length;i++)
        {
            map.put(ar[i], map.getOrDefault(ar[i],0)+1);

        }
        int count=0;
        for(Integer k : map.keySet())
        {
            int val = map.get(k);
            {
                if(val==1)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
