package Sixth;

import java.util.ArrayList;

public class Wraper {

	public static void main(String[] args) {
		
		int d=6;
		int k=6;
		Integer ob=new Integer(d);  //Boxing
		Integer ok=k; 				//Auto=Boxing
		System.out.println(ob);
		System.out.println(ok);
	//converting in opposite way
		int t=ob.intValue();
		System.out.println(t); 		//Un-Boxing
		
		
		//Arraylist
		
		ArrayList students=new ArrayList<>();
		students.add(100);		//adding the value in the array
		students.add(6000000000L);
		students.add("students");
		students.add(38.45F);
		System.out.println(students.size()); // to see the size of the value we enter (and it is 4)
		
		

	}

}
