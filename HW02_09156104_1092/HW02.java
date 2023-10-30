//資一A 09156104 朱可棠 
package HW02_09156104_1092;

public class HW02_0901_09156104_1092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(4, 40);// 4*40 的長方形
		System.out.println(
				"The area of rectangle with width " + r1.width + " and height " + r1.height + " is " + r1.getArea());
		System.out.println("The perimeter of a rectangle is " + r1.getPerimeter());

		Rectangle r2 = new Rectangle(3.5, 35.9);// 3.5*35.9 的長方形
		System.out.println("The area of rectangle with width " + r2.width + " and height " + r2.height + " is "
				+ r2.getArea());
		System.out.println("The perimeter of a rectangle is " + r2.getPerimeter());
	}
}

class Rectangle {
	// 宣告 width 和 height 的default value 為 1
	// data field
	double width = 1;
	double height = 1;

	// constructor
	public Rectangle() {
		
	}
	public Rectangle(double newwidth, double newheigth) {
		width = newwidth;
		height = newheigth;

	}

	// 計算長方形的面積
	public double getArea() {
		return (width * height);// 回傳面積
	}

	// 計算長方形的周長
	public double getPerimeter() {
		return (width + height) * 2;// 回傳周長
	}

}
