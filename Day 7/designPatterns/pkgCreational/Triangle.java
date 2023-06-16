package pkgDay6.designPatterns.pkgCreational;

public class Triangle extends Shape{
	public Triangle() {
		super("Triangle");
	}

	@Override
	public String toString() {
		return "Triangle [shapeName=" + shapeName + "]";
	}
}
