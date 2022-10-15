package assignment1;

//Write a program to swap two number. For example a=10 and b=20 output should be a=20 and b=10

public class Task1 {

	public static void main(String[] args) {

		int a=10;
		int b=20;

		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("Value of a :- " + a + " " + "Value of b :- " + " after swapping " + b);

	}

}
