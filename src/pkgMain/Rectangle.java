package pkgMain;

public class Rectangle {

	private double Length;
	private double Width;
	public Rectangle(double length, double width) {
		Length = length;
		Width = width;
	}
	public double getLength() {
		return Length;
	}
	public double getWidth() {
		return Width;
	}
	
	public double Area()
	{
		//Implements the area function as a product of length and width
		return Length * Width;
	}	
}
