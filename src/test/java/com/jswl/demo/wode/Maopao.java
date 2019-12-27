package com.jswl.demo.wode;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Maopao {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(2);
		list.add(9);
		list.add(7);
		list.add(10);
		list.add(0);
		for (Integer i : list) {
			System.out.print(i + "-");
		}
		boolean flag = true;
		Integer i;
		List<Integer> list2 = new ArrayList<Integer>();
		for (int j = 0; j < (list.size() - 1); j++) {
			
		}
	}
}
