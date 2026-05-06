/**

        * File: 4.5

        * Author: Joe Yang

        * Date Created: April 20, 2026

        * Date Last Modified: April 20, 2026

        */


public class PracticeProblem {

	public static void main(String args[]) {
	}

	public static String triangle(int num){
	String shape = "";
	
	for (int i = 1; i <= num; i++){
		for (int o = 0; o < i; o++ ){
		
		shape = shape + "*";
		}

		shape = shape + "\n";
	}
	return shape;

	}

	public static String pyramid(int num){
		String shape = "";

		for (int i = 1; i <= num; i++){
			for (int o = 0; o < num - i ; o++ ){
		shape = shape + " ";
	}


	for (int o = 0; o < i; o++){
		shape = shape + "*";

		if (o < i - 1){
			shape = shape + " ";
		}
	}

	shape = shape + "\n";
	}
	return shape;

}

	public static String multiplicationTable(int num){
		String ans = "";

		for (int i = 1; i <= num; i++){
			for (int o = 1; o <= num; o++){
				ans = ans + (i * o);

				if (o < num){
					ans = ans + " ";
				}
			}
			ans = ans + "\n";

		}
		return ans;
	}

}