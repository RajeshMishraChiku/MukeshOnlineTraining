package assignment3;

import java.util.Arrays;
import java.util.List;

//Write a program which will pick the values from Array and Store them List
public class Task5 {

	public static void main(String[] args) {

		int[] arr = new int[3];

		arr[0]=2;
		arr[1]=3;
		arr[2]=4;


		List<Integer> arrInList = Arrays.asList(2,3,4,5,6);
//		arrInList.add(arr[0]);
//		arrInList.add(arr[1]);
//		arrInList.add(arr[2]);


		System.out.println(arrInList);

	}
}
