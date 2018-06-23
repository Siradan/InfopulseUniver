package ua.univer.figures.model;

public class ColoredPoint extends Point {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ColoredPoint() {
		this("WHITE");
	}
	
	public ColoredPoint(String color) {
		super();
		this.color = color;
	}
	
	public ColoredPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColoredPoint [color=" + color + ", x=" + getX() + ", y=" + getY() + ", pointId=" + getPointId()
				+ ", id =" + Point.getId() + ", defaultX =" + Point.getDefaultX() + ", defaultY =" + Point.getDefaultY()
				+ "]";
	}

}
