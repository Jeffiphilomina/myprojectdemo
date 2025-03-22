package com.handson.HandsonPractice.Collections;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(30);
		al.add(20);
		al.add(10);
		al.add(50);
		al.add(5);
		//al.remove(20); We cant specify the value, we can use only index for integer
		System.out.println(al.size());
		Collections.sort(al);
		int index=al.indexOf(30);
		System.out.println(index);
		System.out.println(al.isEmpty());
		System.out.println(al);
		System.out.println(al.get(0));
		
		ArrayList<String> as=new ArrayList<>();
		as.add("Hello");
		as.add("world");
		as.remove("Hello"); //for string we can directly remove it
		System.out.println(as);
		System.out.println(as.get(0));
		System.out.println(as.contains("Hello"));
		as.clear();
		System.out.println("ArrayList after clearing it:"+as);
	}

}
