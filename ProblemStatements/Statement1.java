package Problemstatements;

import java.util.HashMap;

//Pickup alternate characters and put them in a hashmap and assign them ascii weightage (0-26) based on the letter. And later get the overall total of ascii values of all characters. Finally reverse the string
public class Statement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String str="Jeffi is a competent automation person in Java selenium";
   int total=0;
   for (int i=0;i<str.length();i=i+2)
   {
	   char currentchar=Character.toLowerCase(str.charAt(i));
	   if (currentchar>='a' && currentchar<='z')
	   {
		  System.out.println(currentchar);
		  int asciivalue=(currentchar-'a')+1;
		  total+=asciivalue;
	   }
	   }
   System.out.println(total);
   
   //HashMap
   String str1="Jeffi is a competent automation person in Java selenium";
   int totalmap=0;
   String str2=str1.toLowerCase();
   System.out.println(str2);
   HashMap<Character,Integer> map=new HashMap();
   for (int z=0;z<str.length();z=z+2)
   {
	   char currentchar1=Character.toLowerCase(str.charAt(z));
	   if (currentchar1>='a' && currentchar1<='z')
	   {
		  System.out.println(currentchar1);
		  map.put(currentchar1,(currentchar1-'a')+1);
		  int value=map.get(currentchar1);
		  totalmap+=value;
}
}
   System.out.println("ascii total value using map"+totalmap);
   System.out.println(map);
   //Ascii value generation program
   //a to z->97 to 122
   //A to Z->65 to 90
   for (int j=1;j<=125;j++)
   {
	char c=(char) j;
   System.out.println("ASCII value"+j+"="+c);
	}
	}
}
