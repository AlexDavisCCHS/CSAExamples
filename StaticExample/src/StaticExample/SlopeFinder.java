package StaticExample;

public class SlopeFinder {
	public static double findSlope(int y2 , int y1 , int x2 , int x1) {
		double slope = (y2 - y1)/(x2 - x1);
		return slope;
	}

}
