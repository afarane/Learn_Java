package com.java.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Java_list {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        List<Integer> list = new ArrayList<Integer>();
        
        for(int i=0; i<n; i++)
        {
            list.add(s.nextInt());
        }
       
        int queries = s.nextInt();
        
        for(int i=0; i <queries; i++ )
        {
            String query = s.next();
            
            if(query.equalsIgnoreCase("insert")){
                int pos = s.nextInt();
                int num = s.nextInt();
                
                list.add(pos,num);
            }else
            {
                list.remove(s.nextInt());
            }
            
        }
        
        for(Integer i : list)
        {
            System.out.print(i + " ");
        }
        
    }
}
