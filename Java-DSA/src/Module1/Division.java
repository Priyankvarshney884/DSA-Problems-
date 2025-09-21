package Module1;

import java.util.ArrayList;
import java.util.Scanner;

//Write a program that returns the list of elements that are present in the given list and are divisible by 5 and 7.
public class Division {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 2;i<=n;i++)
        {
            if(n%i==0)
            {
                arr.add(i);
            }
        }

        for(int i : arr)
        {
            System.out.print(i+" ");
        }

    }
}
