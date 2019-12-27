package com.jswl.demo.wode;

import java.util.ArrayList;
import java.util.List;

public class TT {  
	  
    public static void main(String[] args) {  
        List<Integer> list = new ArrayList<Integer>();  
        list.add(76);  
        list.add(4);  
        list.add(43);  
        list.add(21);  
        list.add(10);  
        for (int i = 0; i < list.size() - 1; i++) {  
            for (int j = 1; j < list.size() - i; j++) {  
                Integer a;  
                if ((list.get(j - 1))>(list.get(j))) { // 比较两个整数的大小  
  
                    a = list.get(j - 1);  
                    list.set((j - 1), list.get(j));  
                    list.set(j, a);  
                }  
            }  
        }  
        for (Integer s : list) {  
            System.out.println(s.intValue());  
        }  
    }  
} 