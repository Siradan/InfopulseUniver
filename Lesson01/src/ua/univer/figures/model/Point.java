package ua.univer.figures.model;

public class Point extends Figure{
	private int x;
	private int y;
	private int pointId;

	private static int id = 0;
	private static int defaultX = 0;
	private static int defaultY = 0;

	public Point() {
		this(defaultX, defaultY);
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		this.pointId = id++;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getPointId() {
		return pointId;
	}

	public void setPointId(int pointId) {
		this.pointId = pointId;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Point.id = id;
	}

	public static int getDefaultX() {
		return defaultX;
	}

	public static void setDefaultX(int defaultX) {
		Point.defaultX = defaultX;
	}

	public static int getDefaultY() {
		return defaultY;
	}

	public static void setDefaultY(int defaultY) {
		Point.defaultY = defaultY;
	}

	@Override
	public String toString() {
		return "Point [x =" + x + ", y =" + y + ", point id =" + pointId + ", id =" + id + ", defaultX =" + defaultX
				+ ", defaultY =" + defaultY + "]";
	}

}
