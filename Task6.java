package assignment3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task6 {

	//	Create a list of numbers 33,44,55,66,77,88 and perform below operation
	//	Remove second element from list using index
	//	Remove second element from list using value
	//	Add 90 at index 3
	//	Get the length of list
	//	Print all values from list using any values




	public static void main(String[] args) {

		List<Integer> listOfNos = new ArrayList<Integer>(Arrays.asList(33,44,55,66,77,88));


		listOfNos.remove(1);
		listOfNos.remove(Integer.valueOf(55));

		listOfNos.add(3, 90);
		System.out.println("LEngth of the list is - " + listOfNos.size());

		for(int i=0;i<listOfNos.size();i++) {
			System.out.println(listOfNos.get(i));
		}

		//		Convert List into array.
		int[] arr = new int[listOfNos.size()];
		for(int i=0;i<listOfNos.size();i++) {
			System.out.println(listOfNos.get(i));
		}


	}
}
