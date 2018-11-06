package Ch2ReviewQuiz;

public class GPSSatellite {
	private String satName;
	private double satSpeed;
	private int  cryptKey;
	private boolean isTransmitting;
	
	public GPSSatellite(String satName , double satSpeed , int cryptKey , boolean isTransmitting) {
		this.satName = satName;
		this.satSpeed = satSpeed;
		this.cryptKey = cryptKey;
		this.isTransmitting = isTransmitting;
	}//end constructor
	
	public String toString() {
		String output = "Satellite statistics:\nName: " + satName + "\nSpeed: " + satSpeed + " [km/hr]\nCryptography key: " + cryptKey + "\nTransmitting: " + isTransmitting;
		return output;
	}//end toString

}//end class
