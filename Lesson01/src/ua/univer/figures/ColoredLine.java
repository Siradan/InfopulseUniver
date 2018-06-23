package ua.univer.figures;

public class ColoredLine extends Line {
	private String color;

	public ColoredLine(Point p0, Point p1) {
		this(p0, p1, "WHITE");
	}

	public ColoredLine(Point p0, Point p1, String color) {
		super(p0, p1);
		this.color = color;
	}

	public ColoredLine(int x0, int y0, int x1, int y1) {
		this(x0, y0, x1, y1, "WHITE");
	}
	
	public ColoredLine(int x0, int y0, int x1, int y1, String color) {
		super(x0, y0, x1, y1);
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColoredLine [color=" + color + ", p0=" + getP0() + ", p1=" + getP1() + "]";
	}

}
