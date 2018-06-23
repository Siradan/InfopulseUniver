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
		super(0, 0);
		setColor("WHITE");
	}

	@Override
	public String toString() {
		return "ColoredPoint [color=" + color + ", x=" + getX() + ", y=" + getY() + ", pointId=" + getPointId()
				+ ", id =" + Point.getId() + ", defaultX =" + Point.getDefaultX() + ", defaultY =" + Point.getDefaultY()
				+ "]";
	}

}
