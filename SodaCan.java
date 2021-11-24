/** EVA CURRY CSC202 Week 6 - Chapter 8 */

public class SodaCan {
	
	private double canRadius;
	private double canHeight;
	
//constructor	
	public SodaCan(double radius, double height)
	{
		canRadius = radius;
		canHeight = height;
	}
	
//surface area of a cylinder 2*pi*radius^2 + 2*pi*radius*height
	public double getSurfaceArea()
	{
		double surfaceArea;
		surfaceArea = (2 * Math.PI * canRadius * canRadius) + (2 * Math.PI * canRadius * canHeight);
		return surfaceArea;
	}

//volume of a cylinder pi*radius^2*height
	public double getVolume()
	{
		double volume;
		volume = Math.PI * canRadius * canRadius * canHeight;
		return volume;
	}

	public static void main(String[] args) {
		
		SodaCan bigCan = new SodaCan(2, 5);
		System.out.println(bigCan.getSurfaceArea());
		System.out.println(bigCan.getVolume());
	}

}
