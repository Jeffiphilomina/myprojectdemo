package Problemstatements;
import java.util.HashMap;
public class Statement2 {
/* Write a program to count the frequency of each word in a given string using a HashMap. The program should:
 * 
 * Take a string input ( a sentence or paragraph) from the user.
 * Split the string into words (ignoring punctuation and case)
 * Use a HashMap to store each unique word as the Key and its frequency as the value.
 * Display the word frequencies in a user friendly format.
 * 
 * Constraints:
 * Ignore case sensitivity (eg, "Hello" and "hello" should be treated as the same word)
 * Ignore punctuation marks (eg, commas,periods,etc..,)
 * The input string can be of arbitrary length.
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //replace->To change character
	  //replaceAll->To change the substring, word
	  String str="Hello world! This is a test. Hello again, world.";
	  //String convertstr=str.replace("!"."").replace(".","").replace(",","");
	  String convertstr=str.toLowerCase().replaceAll("[^a-zA-Z\\s]","");
	  //s->Whitespaces,tabs
	  System.out.println(convertstr);
	  HashMap<String,Integer> map=new HashMap<>();
	  HashMap<String,Integer> keysentry=new HashMap<>();
	  String[] words=convertstr.split(" ");//split("\\s+") to handle mutiple spaces or tabs correctly
	  int value=0;
	  for (int i=0;i<words.length;i++) //for arrays length property, for string length() method
	  {
		  if(map.containsKey(words[i]))
		  {
			  keysentry.put(words[i],keysentry.getOrDefault(words[i],1)+1);
		  }
		  map.put(words[i],map.getOrDefault(words[i],0)+1);
	  }
	  System.out.println("DuplicateMap"+keysentry);
	  System.out.println("Map"+ map);
	  //When you iterate through a HashMap, you can use Map.entry (or HashMap.Entry) to access both the key and value of each pair. HashMap.Entry is a interface inside the HashMap class in Java. It represents a key-value pair in the Hashmap
	  for (HashMap.Entry<String,Integer> entry:map.entrySet()) {
		  String key=entry.getKey();
		  Integer value1=entry.getValue();
		  System.out.println(key+":"+value1);
	  }
	}

}
