import java.util.Scanner;

public class KeyboardScanner {
	public static void main(String[] args) {
		Scanner keyb = new Scanner(System.in);
		int input;//instantiating
		int input2;
		int sum = 0; //initialized
		
		System.out.println("Enter a number");
		input = keyb.nextInt();
		System.out.println("Enter a second number");
		input2 = keyb.nextInt();
		sum = input + input2;
		System.out.println("added together they are " + sum);
	}//end main

}//end class
