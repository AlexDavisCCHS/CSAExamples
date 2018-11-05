package ArrayCalculator;

public class ArrayCalculator {
	private int[] numList = new int[4];
	
	public ArrayCalculator() {
		for (int index = 0; index < numList.length; index++) {
			numList[index] = 0;
		}//end for
	}//end zero arg constructor
	
	public ArrayCalculator(int[] numList) {
		this.numList = numList;
	}//end constructor
	
	public int getNumListItem(int index) {//getter requires an argument to know which item in the array to get
		return numList[index];
	}//end getter
	
	public void setNumListItem(int index , int newValue) {//setter requires 2 arguments: which item and what to set it to
		this.numList[index] = newValue;
	}//end setter
	
	public int calcAdd() {
		int sum = 0;
		for (int index = 0; index < numList.length; index++) {
			sum += numList[index];
		}//end for
		return sum;
	}//end calcAdd

	public int calcSubtract() {
		if(numList.length > 0) {//to prevent array of length 0 from crashing the program
			int difference = numList[0];//subtract must start with first number, cannot start from 0
			for (int index = 1; index < numList.length; index++) {
				difference -= numList[index];
			}//end for
			return difference;
		}//end if
		else {
			return 0;
		}//end else
	}//end calcSubtract
	
	public int calcMultiply() {
		if(numList.length > 0) {//to prevent array of length 0 from crashing the program
			int product = 1;//multiply could start with 1 
			for (int index = 0; index < numList.length; index++) {
				product *= numList[index];
			}//end for
			return product;
		}//end if
		else {
			return 0;
		}//end else
	}//end calcMultiply

	public double calcDivide() {//returns double for divide
		if(numList.length > 0) {//to prevent array of length 0 from crashing the program
			double quotient = numList[0];//divide must start with the first number, 1 would not work
			for (int index = 1; index < numList.length; index++) {
				quotient /= numList[index];
				System.out.println(quotient);
			}//end for
			return quotient;
		}//end if
		else {
			return 0.0;
		}//end else
	}//end calcDivide

	
	public String toString() {
		String output = "The number in the list are: ";
		for (int index = 0; index < numList.length; index++) {
			output += numList[index] + ", ";
		}//end for loop
		return output;
	}//end toString

}//end class
