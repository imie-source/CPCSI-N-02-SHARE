package fr.imie;

public class Application {

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public void start() {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		rect.setLargeur(5f);
		rect.setLongueur(10f);

		Circle circle = new Circle();
		circle.setRadius(1f);
		
		printAreaOf(rect);
		printPerimeterOf(rect);

		printAreaOf(circle);
		printPerimeterOf(circle);
	}
	
	public void printAreaOf(Shape shape){
		System.out.format("l'aire de cette forme %s est de %f\n",shape.getDecriptor(),shape.area());
	}
	
	public void printPerimeterOf(Shape shape){
		System.out.format("le périmètre de cette forme %s est de %f\n",shape.getDecriptor(),shape.perimeter());
	}
}
