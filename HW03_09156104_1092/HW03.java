//資一A 09156104 朱可棠
package HW03_09156104_1092;

import java.util.Scanner;

public class HW03_0911_09156104_1092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//提示使用者輸入a,b,c,d,e,f的值
		System.out.println("Enter a, b, c, d, e, f:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double d = input.nextDouble();
		double e = input.nextDouble();
		double f = input.nextDouble();
		
		LinearEquation L = new LinearEquation(a, b, c, d, e, f);
		if (L.isSolvable() == 0)
			System.out.println("The equation has no solution");
		else
			System.out.println("x is "+L.getX()+" and y is "+L.getY());
	}

}
//創一個class名為LinearEquation
class LinearEquation {
	//宣告data fields a,b,c,d,e,f
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
    //constructor
	LinearEquation(double A, double B, double C, double D, double E, double F) {
		a = A;
		b = B;
		c = C;
		d = D;
		e = E;
		f = F;
	}
    //getter methods
	public double getnewa() {
		return a;
	}

	public double getnewb() {
		return b;
	}

	public double getnewc() {
		return c;
	}

	public double getnewd() {
		return d;
	}

	public double getnewe() {
		return e;
	}

	public double getnewf() {
		return f;
	}
    //計算分母的部份
	public double isSolvable() {
		return (a * d) - (b * c);
	}
    
	public double getX() {
		//先判斷分母是否為0
		if (isSolvable() == 0)
			return 0;
		else
			return ((e * d) - (b * f)) / isSolvable();
	}

	public double getY() {
		//先判斷分母是否為0
		if (isSolvable() == 0)
			return 0;
		else
			return ((a * f) - (e * c)) / isSolvable();
	}

}
