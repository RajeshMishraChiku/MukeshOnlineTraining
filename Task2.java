package assignment1;

//Write a program to print the sum of below 5 numbers.
//10,90.78,111,8989,7876


public class Task2 {

	public static void main(String[] args) {

		double[] arr = {10,90.78,111,8989,7876};
		double sum =0;
		for(int i=0;i<arr.length;i++) {
			sum = sum +arr[i];

		}

		System.out.println("Sum of 5 numbers is " + sum);

	}

}
