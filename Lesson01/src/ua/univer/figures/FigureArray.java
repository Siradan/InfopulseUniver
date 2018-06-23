package ua.univer.figures;

import java.util.Arrays;
import java.util.Stack;

public class FigureArray {

	private Object[] array;

	public FigureArray(int size) {
		array = new Object[size];
	}

	public FigureArray() {
		this(0);
	}

	public FigureArray(Object... objects) {
		Stack<Object> stack = new Stack<Object>();

		for (Object object : objects) {
			if (checkType(object.getClass().getName())) {
				stack.push(object);
			}
		}
		array = new Object[stack.size()];
		stack.toArray(array);
	}

	public Object getFigure(int i) {
		return array[i];
	}

	public void setFigure(int i, Object object) {
		if (checkType(object.getClass().getName())) {
			array[i] = object;
		}
	}
	
	public int getSize() {
		return array.length;
	}

	private static boolean checkType(String type) {
		return type.contains("ua.univer.figures.model");
	}

	@Override
	public String toString() {
		return "FigureArray [" + Arrays.toString(array) + "]";
	}
}
