package assignment1;

//Write a program which will break the current execution if it find “Selenium”
//Input – [“Java”,”JavaScript”,”Selenium”,”Python”,”Mukesh”]


public class Task10 {


	public static void main(String[] args) {

		String[] arr = {"Java","JavaScript","Selenium","Python","Mukesh"};

		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);

			if(arr[i].equals("Selenium"))
			{
				System.out.println("break the loop");
				break;
			}
		}
	}

}
