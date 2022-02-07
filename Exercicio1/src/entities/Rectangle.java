package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	//calcula a area do retangulo
	public double area() {
		return width*height;
	}
	
	//calcula o perimetro
	public double perimeter() {
		return 2*(width+height);
	}
	
	//calcula a diagonal
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
