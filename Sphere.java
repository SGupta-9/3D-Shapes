public class Sphere implements Shape{
	private double radius;
	
	public Sphere(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double volume() {
		double volume = (4/3) * Math.PI * Math.pow(this.radius, 3);
		return volume;
	}
	
	public double surfaceArea() {
		double surfaceArea = 4 * Math.PI * Math.pow(this.radius, 2);
		return surfaceArea;
	}
}