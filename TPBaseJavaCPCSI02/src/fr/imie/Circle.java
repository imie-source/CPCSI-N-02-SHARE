/**
 * 
 */
package fr.imie;

/**
 * @author imie
 *
 */
public class Circle implements Shape {

	private Float radius;

	/**
	 * 
	 */
	public Circle() {
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.imie.Shape#area()
	 */
	@Override
	public Float area() {
		return new Float(Math.PI) * radius * radius;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.imie.Shape#perimeter()
	 */
	@Override
	public Float perimeter() {
		return 2 * new Float(Math.PI) * radius;
	}

	/**
	 * @return the radius
	 */
	public Float getRadius() {
		return radius;
	}

	/**
	 * @param radius
	 *            the radius to set
	 */
	public void setRadius(Float radius) {
		this.radius = radius;
	}

	@Override
	public String getDecriptor() {
		return "Cercle";
	}

}
