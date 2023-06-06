package day5_abstraction;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape rect = new Rectangle(); // Quá trình Upcasting 
		rect.setColor("Green");
		rect.draw();
		
		Shape circle = new Circle();
		circle.draw();
	}
}
