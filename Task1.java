package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Write a program which can store List of Integer values and print all the values using for loop.

public class Task1 {
	
	public static void main(String[] args) {
		
		List<Integer> intValues = Arrays.asList(20,30,40,50,60);
		
		for(int i=0;i<intValues.size();i++) {
			System.out.println(intValues.get(i));
		}
		
		
		
	}

}
