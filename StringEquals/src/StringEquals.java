
public class StringEquals {
	public static void main(String[] args) {
		String password = "abc";
		
		if (password.equals("abcd")) {
			System.out.println("Access Granted");
		}//end if
		
		else {
			System.out.println("Access Denied");
		}//end else
	}//end main

}//end class
