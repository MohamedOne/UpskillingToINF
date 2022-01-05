import java.util.*;

public class Rectangle {

	private int height;
	private int length;
	
	public Rectangle(int h, int l) {
		height = h;
		length = l;
	}
	
	public int getArea() {
		return height * width;
	}
	
	public int getPerimeter() {
		return 2 * (height + width);
	}
}
		
