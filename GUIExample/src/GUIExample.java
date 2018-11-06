import javax.swing.JOptionPane;

public class GUIExample {
	public static void main(String[] args) {
		int firstNum = 2;
		int secondNum;
		int sum;
		String input = JOptionPane.showInputDialog("Type a number");
		//parse a String
		secondNum = Integer.parseInt(input);
		sum = firstNum + secondNum;
		
		System.out.println(sum);
	}//end main

}//end class
