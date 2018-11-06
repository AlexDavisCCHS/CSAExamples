
public class BeginArrays {
	public static void main(String[] args) {
		int[] nums = new int[12];//0-11
		//nums[0] = 5;
		//nums [10] = 23;
										//how long is the array nums
		for (int index = 0; index < nums.length; index++) {//travering an array
			nums[index] = index+1;
		}//end for loop array filler
		
		for (int index = 0; index < nums.length; index++) {
			System.out.println(nums[index]);
		}//end for loop array printer
	}//end main

}//end class
