package Module1;

import java.util.ArrayList;
import java.util.Scanner;

// Problem Description
//
//You are given a N X N square integer matrix A. You have to tell whether A is an identity matrix or not.
//
//Identity matrix is a special square matrix whose main diagonal elements are equal to 1 and all other elements are 0.
public class IdentityMatrix {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        input = input.substring(1,input.length()-1);

        String[] rows = input.split("],");

        ArrayList<ArrayList<Integer>> ar = new ArrayList<>();
        for(String row : rows)
        {
            row = row.replace("[","").replace("]","").trim();

            String[] nums = row.split(",");

            ArrayList<Integer> temp = new ArrayList<>();
            for(String num: nums)
            {
                temp.add(Integer.parseInt(num.trim()));
            }
            ar.add(temp);

        }
        boolean identity= true;
        for(int i=0;i<ar.size();i++)
        {
            for(int j=0;j<ar.get(i).size();j++)
            {
                if(i==j)
                {
                    if(ar.get(i).get(j)!=1)
                    {
                        identity=false;
                    }
                }
            }
        }
        System.out.println(identity);

    }
}
