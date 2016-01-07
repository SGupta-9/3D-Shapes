public class TriangularPrism extends Prism{
	private double baseA;
	private double baseB;
	private double baseC;
	
	public TriangularPrism(double height, double a, double b, double c) {
		this.height = height;
		this.baseA = a;
		this.baseB = b;
		this.baseC = c;
	}
	
	public double areaBase() {
		double s = (baseA + baseB + baseC) / 2;
		double adiff=Math.abs(s-baseA);
		double bdiff=Math.abs(s-baseB);
		double cdiff=Math.abs(s-baseC);
		double areaOfBases = 2.0 * (Math.sqrt(s * adiff * bdiff * cdiff));
		return areaOfBases;
	}
	
	public double surfaceArea() {
		double surfaceArea = ((this.baseA*this.height) + (this.baseB*this.height) + 
				(this.baseC*this.height) + areaBase());
		return surfaceArea;
	}
}