package javaTraining;

import java.io.*;
import java.util.*;

public class Filereaderandcollections {

	public static void main(String[] args) throws IOException {

		/*
		 * //File file=new File("C:\\Users\\LENVO\\Documents\\text.txt"); FileReader
		 * fr=new FileReader("C:\\Users\\LENVO\\Documents\\text.txt"); BufferedReader
		 * br=new BufferedReader(fr); String text;
		 * 
		 * 
		 * while((text=br.readLine())!=null) { System.out.println(text);
		 * 
		 * } br.close();
		 * 
		 */
		/*
		 * ArrayList<Integer> alist=new ArrayList<Integer>(); alist.add(5);
		 * alist.add(58); alist.add(98); alist.add(32); alist.add(64); alist.add(69);
		 * System.out.println("Array List size is: "+alist.size());
		 * System.out.println("Array List elements are : "); //for(int i=0;
		 * i<alist.size(); i++) { System.out.println(alist.get(i));} for(Integer
		 * i:alist) { System.out.println(i); }
		 */
		/*
		 * 
		 * HashSet<String> hset=new HashSet<String>(); hset.add("My"); hset.add("name");
		 * hset.add("is"); hset.add("Harish");
		 * 
		 * for(String i :hset) { System.out.println(i);//random order and no indexing
		 * concept here }
		 */

		// Iterator(interface) ,iterator()-method-it belongs to collection interface;
		// not inter related but iterator method returns Iterator
		/*
		 * ArrayList<String> alist=new ArrayList<String>(); alist.add("Welcome");
		 * alist.add("to"); alist.add("Java"); alist.add("Training");
		 * 
		 * Iterator<String> itr = alist.iterator(); while(itr.hasNext()) {
		 * System.out.println(itr.next()); }
		 */
		
		HashMap<Integer,String> hmap=new HashMap<>();
		
		hmap.put(101, "Harish");
		hmap.put(102,"Arun");
		hmap.put(103,"Suresh");
		
		for(Object i:hmap.keySet()) {
			System.out.println(hmap.get(i));
		}
		
		

	}

}
