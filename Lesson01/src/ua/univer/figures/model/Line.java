package ua.univer.figures.model;

public class Line {
	private Point p0;
	private Point p1;

	public Line(Point p0, Point p1) {
		super();
		this.p0 = p0;
		this.p1 = p1;
	}

	public Line(int x0, int y0, int x1, int y1) {
		p0 = new Point(x0, y0);
		p1 = new Point(x1, y1);
	}

	public Point getP0() {
		return p0;
	}

	public void setP0(Point p0) {
		this.p0 = p0;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	@Override
	public String toString() {
		return "Line [p0=" + p0 + ", p1=" + p1 + "]";
	}

}
