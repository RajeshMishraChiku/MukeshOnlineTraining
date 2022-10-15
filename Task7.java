package assignment1;

//*        		00
//* *      		10 11
//* * *    		20 21 22 
//* * * *  		30 31 32 33
//* * * * *		40 41 42 43
//* * * * * *	50 51 52 53 54 55

public class Task7 {

	public static void main(String[] args) {
		int i,j=0;
		for(i=0;i<6;i++) {

			for(j=0;j<=i;j++) {

				System.out.print(" * ");
			}
			System.out.println();
		}
	}

}
