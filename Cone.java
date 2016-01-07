public class Cone implements Shape{
	private double radius;
	private double slantHeight;
	private double height;
	
	public Cone(double radius, double height, double slantHeight) {
		this.radius = radius;
		this.height = height;
		this.slantHeight = slantHeight;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double getSlantHeight() {
		return this.slantHeight;
	}
	
	public double getHeight() {
		return this.height;
	}
	
	public double volume() {
		double volume = (1.0/3) * Math.PI * Math.pow(this.radius, 2) * this.height;
		return volume;
	}
	
	public double surfaceArea() {
		double surfaceArea = (Math.PI * this.radius * this.slantHeight) + (Math.PI * Math.pow(radius, 2));
		return surfaceArea;
	}
}