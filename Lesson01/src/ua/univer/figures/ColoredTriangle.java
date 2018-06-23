package ua.univer.figures;

public class ColoredTriangle extends Triangle {
	private String color;

	public ColoredTriangle(Point p0, Point p1, Point p2) {
		this(p0, p1, p2, "WHITE");
	}

	public ColoredTriangle(Point p0, Point p1, Point p2, String color) {
		super(p0, p1, p2);
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColoredTriangle [color=" + color + ", line0=" + getLine0() + ", line1=" + getLine1()
				+ ", line2=" + getLine2() + "]";
	}

	
}
