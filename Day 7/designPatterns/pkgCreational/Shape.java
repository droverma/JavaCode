package pkgDay6.designPatterns.pkgCreational;

public class Shape {
	String shapeName;

	public Shape() {}
	public Shape(String shapeName) {
		super();
		this.shapeName = shapeName;
	}

	@Override
	public String toString() {
		return "Shape [colorName=" + shapeName + "]";
	}
}
