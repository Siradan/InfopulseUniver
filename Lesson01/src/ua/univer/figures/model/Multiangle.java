package ua.univer.figures.model;

import java.util.Arrays;

public class Multiangle {
	private Point[] points;
	private Line[] lines;

	public Multiangle(int n) {
		this.points = new Point[n];
	}

	public Multiangle() {
		this(3);
	}

	public Multiangle(Point... points) {
		this.points = points;
	}

	public Line[] getLines() {
		if (lines == null) {
			lines = new Line[points.length];
			for (int i = 0; i < points.length - 1; ++i) {
				lines[i] = new Line(points[i], points[i + 1]);
			}
			lines[lines.length - 1] = new Line(points[points.length - 1], points[0]);
		}
		return lines.clone();
	}

	public Point getPoint(int i) {
		return points[i];
	}

	public void setPoint(int i, Point point) {
		points[i] = point;
		if (lines != null) {
			int index0, index1;
			if (i == 0) {
				index0 = lines.length - 1;
				index1 = 0;
			} else {
				index0 = i + 1;
				index1 = i + 2;
			}
			lines[i] = new Line(points[i], points[i + 1]);
			lines[index0] = new Line(points[index0], points[index1]);
		}
	}

	@Override
	public String toString() {
		return "Multiangle [lines=" + Arrays.toString(getLines()) + "]";
	}
}
