package ua.univer.figures.model;

public class Triangle extends Figure{
	private Point p0, p1, p2;
	private Line p0p1, p1p2, p0p2;

	public Triangle(Point p0, Point p1, Point p2) {
		this.p0 = p0;
		this.p1 = p1;
		this.p2 = p2;
	}

	public Line getLine0() {
		if (p0p1 == null) {
			p0p1 = new Line(p0, p1);
		}
		return p0p1;
	}

	public Line getLine1() {
		if (p1p2 == null) {
			p1p2 = new Line(p1, p2);
		}
		return p1p2;
	}

	public Line getLine2() {
		if (p0p2 == null) {
			p0p2 = new Line(p0, p2);
		}
		return p0p2;
	}
	
	public Line[] getLines() {
		return new Line[] {getLine0(), getLine1(), getLine2()};
	}

	@Override
	public String toString() {
		return "Triangle [line0=" + getLine0() + ", line1=" + getLine1() + ", line2=" + getLine2() + "]";
	}

}
