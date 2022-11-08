package assignment3;

import java.util.Arrays;
import java.util.List;

//Write a program which will print sum of all numbers which is stored in list.
public class Task4 {


	public static void main(String[] args) {


		List<Integer> intValues = Arrays.asList(20,30,40,50,60);
		int sum = 0 ;

		for(int i=0;i<intValues.size();i++) {
			sum =sum + intValues.get(i);


		}
		System.out.println(sum + " : is the sum");



	}
}
