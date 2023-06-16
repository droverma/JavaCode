package pkgDay6.designPatterns.pkgCreational;

public class ColorFactory {
	public Color getColor(String c) {
		Color cc;
		if(c.equals("Red")) cc=new Red();
		else if(c.equals("Blue")) cc=new Blue();
		else cc=new Green();
		return cc;
	}
}
