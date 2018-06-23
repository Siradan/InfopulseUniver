package ua.univer.figures;

public class Program {

	public static void main(String[] args) {
		Point.setId(100);
		Point p1 = new Point(1, 0);
		Point p2 = new Point();
		Point p3 = new Point(1, 1);
		Point p4 = new Point(0, 1);
		ColoredPoint cp1 = new ColoredPoint();
		/*System.out.println(p1);
		System.out.println(p2);
		System.out.println(cp1);*/
		Line line0 = new Line(p1, p2);
		Line line1 = new Line(0, 0, 1, 0);
		Line line2 = new Line(cp1, p1);
		/*System.out.println(line0);
		System.out.println(line1);
		System.out.println(line2);*/
		Triangle triangle = new Triangle(p1, p2, cp1);
		//System.out.println(triangle);
		Multiangle figure = new Multiangle(p1, p2, p3, p4);
		//System.out.println(figure);
		FigureArray array = new FigureArray(p1, p2, p3, cp1, line0, line2, triangle, figure);
		System.out.println(array);
	}

}
