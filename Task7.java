package assignment3;

import java.util.Arrays;
import java.util.List;

/*Write a program which will display true if list contains Mobile else prints false
List  - Web Automation, API Automation, Mobile Automation.
Output – True 
 */
public class Task7 {

	public static void main(String[] args) {


		List<String> listOfTechnologies = Arrays.asList("Web Automation","API Automation","Mobile Automation");


		for(int i=0;i<listOfTechnologies.size();i++) {

			if(listOfTechnologies.get(i).contains("Mobile"))
				System.out.println("True");
		}

	}




}
