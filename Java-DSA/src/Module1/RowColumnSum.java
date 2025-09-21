package Module1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//Problem Description
//You are given a matrix A, you have to return an array containing sum of each row elements followed by sum of each column elements of the matrix.
//
//
//NOTE: If the matrix given is of size (N x M), then the array you return would be of size (N + M), where first N elements contain the sum of each N rows, and the next M elements contain the sum of each M columns.
public class RowColumnSum {
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

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        list = Helper(ar);
        for(ArrayList<Integer> r : list)
        {
            System.out.println(r);
        }
    }

    public static ArrayList<ArrayList<Integer>> Helper(ArrayList<ArrayList<Integer>> ar)
    {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        // --- Row sums ---
        for (int i = 0; i < ar.size(); i++) {
            int rsum = 0;
            for (int j = 0; j < ar.get(i).size(); j++) { // use ar.get(i) not ar.get(0)
                rsum += ar.get(i).get(j);
            }
            // Store row sum as a single-element list
            arr.add(new ArrayList<>(Arrays.asList(rsum)));
        }

        // --- Column sums ---
        for (int i = 0; i < ar.get(0).size(); i++) {
            int csum = 0;
            for (int j = 0; j < ar.size(); j++) {
                csum += ar.get(j).get(i);
            }
            // Store column sum as a single-element list
            arr.add(new ArrayList<>(Arrays.asList(csum)));
        }

        return arr;

    }

}
