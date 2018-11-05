package ArrayCalculator;

public class ArrayCalculatorDriver {
	public static void main(String[] args) {
		int[] list = {97 , 85 , 88 , 62};
		
		ArrayCalculator calculationList = new ArrayCalculator(list);
		System.out.println(calculationList.calcDivide());
		
		System.out.println(calculationList);
	}//end main

}//end class
