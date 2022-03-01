package com.lovebabbar.stringdemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Perm
{
    public static void permute(HashMap<Integer, Integer> map)
    {
        if(map.isEmpty())
        {
            System.out.println();
        }
        else
        {
            Iterator it = map.entrySet().iterator(); 
            //Set<Integer> keys = map.keySet();
            while(it.hasNext())
            //for(int num: keys)
            {
                Map.Entry pair = (Map.Entry)it.next();
                int num = (int) pair.getKey();
                System.out.print(Integer.toString(num)+",");
                int val = (int) pair.getValue()-1;
                //HashMap<Integer, Integer> newMap = map;
                //int val = map.get(num) -1;
                if(val == 0)
                {
                    //newMap.remove(num);
                    it.remove(); 
                }
                else
                {
                    //newMap.put(num, val);
                    pair.setValue(val);
                }
                permute(map);
            }
        }
    }
    public static void main(String args []) throws FileNotFoundException
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Scanner in = new Scanner(new File(args[0]));
        int num;
        while(in.hasNextInt())
        {
            num = in.nextInt();
            if(map.containsKey(num))
            {
                map.put(num, map.get(num)+1);
            }
            else
            {
                map.put(num,1);
            }
        }
        permute(map);
    }
}
