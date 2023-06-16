package pkgDay6.designPatterns.pkgCreational;

public class AbstractFactory {
	ShapeFactory sh=new ShapeFactory();
	ColorFactory co=new ColorFactory();
	public Shape selectShape(String s) {
		return sh.getShape(s);
	}
	public Color selectColor(String s) {
		return co.getColor(s);
	}
	public void draw(Shape s, Color c) {
		System.out.println("In color : " + c + " We draw a " + s);
	}
}
