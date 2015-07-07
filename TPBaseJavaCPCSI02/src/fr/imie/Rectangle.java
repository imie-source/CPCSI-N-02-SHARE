/**
 * 
 */
package fr.imie;

/**
 * @author imie
 *
 */
public class Rectangle implements Shape {

	private Float longueur;
	private Float largeur;
	
	/**
	 * 
	 */
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see fr.imie.Shape#area()
	 */
	@Override
	public Float area() {
		return this.largeur*this.longueur;
	}

	/* (non-Javadoc)
	 * @see fr.imie.Shape#perimeter()
	 */
	@Override
	public Float perimeter() {
		return 2*(this.longueur+this.largeur);
	}

	/**
	 * @return the longueur
	 */
	public Float getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(Float longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return the largeur
	 */
	public Float getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(Float largeur) {
		this.largeur = largeur;
	}

	@Override
	public String getDecriptor() {
		return "Rectangle";
	}
	
	

}
