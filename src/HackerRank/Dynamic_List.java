package HackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;

public class Dynamic_List {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        List<Integer>[] seqList = new List[n];
        for (int i = 0; i < n; i++) {
            seqList[i] = new ArrayList<Integer>();
        }
        int lastans = 0;
        for (int i = 0; i < q; i++) {
            int querynumber = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            List<Integer> sequence=seqList[(x^lastans)%n];
            
             if(querynumber==1)
             sequence.add(y);
            
             else
             {
             lastans = sequence.get(y%sequence.size());
             System.out.println(lastans);
             }
            
        }
        }

    }

