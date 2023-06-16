package pkgDay6.designPatterns.pkgCreational;

public class ShapeFactory {
	public Shape getShape(String s) {
		Shape ss;
		if(s.equals("Triangle")) ss=new Triangle();
		else if(s.equals("Square")) ss=new Square();
		else ss=new Rectangle();
		return ss;
	}
}
