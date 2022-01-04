import java.util.*;

public class Main {
    public static void main(String... args) {
          Scanner input = new Scanner(System.in);
          
          System.out.println("Please enter input radius of circle: ");
          int radius = input.nextInt();
          System.out.println("Please enter length and height of rectangle: );
          int length = input.nextInt(); int height = input.nextInt();
          System.out.println("Please enter side of square: ");
          int side = input.nextInt();
          System.out.print(findCircleArea(radius));System.out.println(findRectangleArea(length, height);System.out.println(findSquareArea(side));
    
       
    }
    
    public static findCircleArea(int radius) {
        return Math.PI * 2 * radius;
    }
    
    public static findRectandleArea(int length, int height) {
        return length * height;
    }
    
    public static findSquareArea(int side) {
        return 2 * side;
    }
    
}    


    
