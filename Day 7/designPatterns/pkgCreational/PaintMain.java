package pkgDay6.designPatterns.pkgCreational;

public class PaintMain {

	public static void main(String[] args) {
		ColorFactory cf=new ColorFactory();
//		Color c=cf.getColor("Green");
//		System.out.println(c);
		AbstractFactory paint =new AbstractFactory();
		paint.draw(paint.selectShape("Triangle"), paint.selectColor("Red"));
	}

}
