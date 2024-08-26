import java.util.Scanner;

public class Diamond
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number: ");
		int numRows = input.nextInt();

		//This code represents the Upper Half Pattern
			System.out.println("*");
		
		for (int i = 1; i <= numRows; i++){
			//print stars
			System.out.print("*");

			//this will print the increasing numbers
			for (int j = 1; j <= i; j++){
				System.out.print(j);
			}

			//print decreasing numbers
			for (int j = i - 1; j >= 1;j--){
				System.out.print(j);
			}

			//print ending stars and the newline
			System.out.println("*");
		}

		//this sections is for the lower half of the pattern
		for (int i = numRows - 1; i >= 1; i--){
			//print stars
			System.out.print("*");

			//print increasing numbers
			for (int j = 1; j <= i; j++){
				System.out.print(j);
			}

			//print decreasing numbers
			for (int j = i - 1; j >= 1; j--){
				System.out.print(j);
			}

			//this section will print the ending star and newlines
			System.out.println("*");
		}
			System.out.println("*");
	}
}