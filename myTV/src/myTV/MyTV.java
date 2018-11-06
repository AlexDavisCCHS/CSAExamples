package myTV;

public class MyTV {
	
	//instance variables
	private int screenSize;//private prevents changes from outside of the class
	private String brand;
	
	//constructors
	public MyTV(){//public name of class()
		this.screenSize = 60;
		this.brand = "Samsung";
	}//end zero argument constructor
	
	public MyTV(int screenSize , String brand) {//instantiated variables
		this.screenSize = screenSize;
		this.brand = brand;
	}//2 argument constructor
	
	public int getScreenSize() {
		return screenSize;
	}//end getScreenSize
	
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}//end setScreenSize
	
	public String getBrand() {
		return brand;
	}//end getBrand
	
	public void setBrand(String brand) {
		this.brand = brand;
	}//end setBrand
	
	//toString
	public String toString() {
		String output;
		output = "This is a " + brand + " TV with a " + screenSize + " inch screen";
		return output;
	}//end toString

}//end class
