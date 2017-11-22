package com.lh.util;

import java.util.Arrays;

public class Test {
	public static void main(String[] args)  throws Exception{
//		Person per[]=new Person[] {new Person("张三",23),
//				new Person("王五",19),
//				new Person("李四",21)};
//		Arrays.sort(per);
//		for(int i=0;i<per.length;i++) {
//			System.out.println(per[i]);
//		}
		
		ComparableThee<Integer> com=new ComparableThee<Integer>();
		com.add(new Integer(23));
		com.add(new Integer(19));
		com.add(new Integer(21));
		Object data[]=com.toArray();
		for(int i=0;i<data.length;i++) {
			System.out.println(data[i]);
		}

	}
}
