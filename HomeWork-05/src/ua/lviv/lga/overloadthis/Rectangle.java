package ua.lviv.lga.overloadthis;

public class Rectangle {
	public double length;
	public double width;
	public double depth;
	
	Rectangle(double l, double w, double d) {
		
		length = l;
		width = w;
		depth = d;
		
	}
			
	
	Rectangle(double a, double b) {
		this(a, b, 30);
	}

	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", depth=" + depth + "]";
	}

	
	
	

}
