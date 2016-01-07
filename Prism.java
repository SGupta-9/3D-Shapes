public abstract class Prism implements Shape{
	public double height;
	public double width;
	public double length;
	
	public abstract double areaBase();
	
	public double volume() {
		return (areaBase() * this.height);
	}
}