public class ShapesMain {
	public static void main(String[ ] args) {
		Cone cone = new Cone(2.0, 1.0, 1.0);
		System.out.println("Volume of cone is " + cone.volume());
		System.out.println("Surface area of cone is " + cone.surfaceArea());
		
		Cube cube = new Cube(3.0);
		System.out.println("Volume of cube is " + cube.volume());
		System.out.println("Surface area of cube is " + cube.surfaceArea());
		
		Cylinder cylinder = new Cylinder(2.0, 1.0);
		System.out.println("Volume of cylinder is " + cylinder.volume());
		System.out.println("Surface area of cylinder is " + cylinder.surfaceArea());
		
		RectangularPrism rectPrism = new RectangularPrism(2.0, 2.0, 2.0);
		System.out.println("Volume of rectPrism is " + rectPrism.volume());
		System.out.println("Surface area of rectPrism is " + rectPrism.surfaceArea());
		
		Sphere sphere = new Sphere(2.0);
		System.out.println("Volume of sphere is " + sphere.volume());
		System.out.println("Surface area of sphere is " + sphere.surfaceArea());
		
		TriangularPrism triPrism = new TriangularPrism(1.0, 2.0, 3.0, 3.0);
		System.out.println("Volume of triPrism is " + triPrism.volume());
		System.out.println("Surface area of triPrism is " + triPrism.surfaceArea());
	}
}