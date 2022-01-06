import java.util.*;

public abstract class Polygon {
	
	public abstract int getArea();
	public abstract int getPerimeter();
}

class Rectangle extends Polygon {
	private int height;
	private int width;
	
	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;
	}
	
	@Override
	public int getArea() {
		return height * width;
	}
	
	@Override
	public int getPerimeter() {
		return 2 * (height + width);
	}
	
}
