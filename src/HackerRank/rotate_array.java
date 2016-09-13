package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//better method Left shift (n-d+i)%n Right shift (i+d)%n
public class rotate_array {
    public int[] rotate(int a[])
    {
        int start = a[0];
        for(int i=1;i<a.length;i++)
        {
           a[i-1]=a[i]; 
        }
        a[a.length-1]=start;
        return a;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        rotate_array s = new rotate_array();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int rotations = sc.nextInt();
        int a[] = new int[size];
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        while(rotations>0)
        {
            a = s.rotate(a);
            rotations--;
        }
        int j=0;
        while(j<size)
        {
            System.out.print(a[j]+" ");
            j++;
        }
    }
}