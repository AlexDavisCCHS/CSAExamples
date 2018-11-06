package myTV;

public class MyTVDriver {
	public static void main(String[] args) {
		//create a MyTV object called livingRoomTV
		MyTV livingRoomTV = new MyTV();
		MyTV bedroomTV = new MyTV(32 , "Sony");
		System.out.println(bedroomTV);
		
		bedroomTV.setScreenSize(40);
		int screen = bedroomTV.getScreenSize();
		System.out.println(screen);
		System.out.println(bedroomTV);
	}//end main method

}//end class
