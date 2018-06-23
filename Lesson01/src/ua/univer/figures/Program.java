package ua.univer.figures;

import ua.univer.figures.model.ColoredPoint;
import ua.univer.figures.model.Figure;
import ua.univer.figures.model.Line;
import ua.univer.figures.model.Multiangle;
import ua.univer.figures.model.Point;
import ua.univer.figures.model.Triangle;

public class Program {
	private static final String POINT = "ua.univer.figures.model.Point";
	private static final String COLORED_POINT = "ua.univer.figures.model.ColoredPoint";
	private static final String LINE = "ua.univer.figures.model.Line";
	private static final String TRIANGLE = "ua.univer.figures.model.Triangle";
	private static final String MULTIANGLE = "ua.univer.figures.model.Multiangle";
	

	public static void main(String[] args) {
		Point.setId(100);
		Point p1 = new Point(1, 0);
		Point p2 = new Point();
		Point p3 = new Point(1, 1);
		Point p4 = new Point(0, 1);
		ColoredPoint cp1 = new ColoredPoint();
		Line line0 = new Line(p1, p2);
		Line line1 = new Line(0, 0, 1, 0);
		Line line2 = new Line(cp1, p1);
		Triangle triangle = new Triangle(p1, p2, cp1);
		Multiangle figure = new Multiangle(p1, p2, p3, p4);
		FigureArray();
	}

	public static void FigureArray() {
		Figure[] figureArray = new Figure[] { new Point(1, 2), new Point(2, 2), new ColoredPoint(0, 0, "BLACK"),
				new Triangle(new Point(), new Point(), new Point()) };
		int points = 0, colpoints = 0, triangles = 0, lines = 0, multiangles = 0;

		for (Figure figure : figureArray) {
			switch (figure.getClass().getName()) {
			case (POINT):
				++points;
				break;
			case (COLORED_POINT):
				++colpoints;
				break;
			case (TRIANGLE):
				++triangles;
				break;
			case (LINE):
				++lines;
				break;
			default:
			}
		}
		
		System.out.println("Points=" + points);
	}
}
