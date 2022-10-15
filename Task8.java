package assignment1;

public class Task8 {
	
//	Write a program to print below students marks who have scored above 80
//	Example- 78,12,89,55,35
//	Output-  78,89


	public static void main(String[] args) {
		
		int[] marks = {78,12,89,55,35};
		for(int i=0;i<marks.length;i++) {
			
			if(marks[i]>80) {
				System.out.println(marks[i]);
			}
		}

	}

}
