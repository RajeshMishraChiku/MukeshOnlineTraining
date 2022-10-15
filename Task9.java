package assignment1;

public class Task9 {

	//Write a program which will break the current execution if it find number 85
	//Input – [12,34,66,85,900]

	public static void main(String[] args) {

		int[] arr = {12,34,66,85,900};
				
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(arr[i]);
			if(arr[i]==85) {
				System.out.println("found number 85 , break");
				break;
			}
			
		}

	}

}
