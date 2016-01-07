public class RectangularPrism extends Prism{
	public RectangularPrism(double length, double width, double height) {
//		assign values to attributes
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public double areaBase() {
		return (this.length * this.width);
	}
	
	public double surfaceArea() {
		double surfaceArea = 2 * ((this.height * this.length) + (this.height* this.width) + (this.length * this.width));
		return surfaceArea;
	}
}