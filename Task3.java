package assignment3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//Write a program which can store List of Integer values and print all the values using for iterator
public class Task3 {


	public static void main(String[] args) {

		List<Integer> intValues = Arrays.asList(20,30,40,50,60);

		Iterator<Integer> itr = intValues.iterator();
		while(itr.hasNext()) {

			int value =itr.next();
			System.out.println(value);
		}

	}
}
