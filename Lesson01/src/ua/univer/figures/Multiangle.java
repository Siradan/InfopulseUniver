package ua.univer.figures;

import java.util.Arrays;

public class Multiangle {
	private Point[] points;
	private Line[] lines;
	
	public Multiangle(Point ...points) {
		this.points = points;
	}
	
	public Line[] getLines() {
		if (lines == null) {
			lines = new Line[points.length];
			for (int i = 0; i < points.length - 1; ++i) {
				lines[i] = new Line(points[i], points[i+1]);
			}
			lines[lines.length - 1] = new Line(points[points.length - 1], points[0]);
		}
		return lines.clone();
	}

	@Override
	public String toString() {
		return "Multiangle [lines=" + Arrays.toString(getLines()) + "]";
	}
}
