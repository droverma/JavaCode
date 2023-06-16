package pkgDay6.designPatterns.pkgCreational;

public class Color {
	String colorName;

	public Color() {
	}

	public Color(String colorName) {
		super();
		this.colorName = colorName;
	}

	@Override
	public String toString() {
		return "Color [colorName=" + colorName + "]";
	}
}
