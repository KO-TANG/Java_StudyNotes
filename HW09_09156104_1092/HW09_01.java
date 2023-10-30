//資一A 09156104 朱可棠
package HW09_09156104_1092;

import java.util.ArrayList;
import java.util.Scanner;

public class HW09_Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Double> list = new ArrayList<>();//創一個ArrayList
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five double values:");
		double value;
		//把5個值接進來
		for(int i = 0;i<5;i++) {
			value = input.nextDouble();
			list.add(value);
		}
		System.out.println("The sum is "+sum(list));
	}
	  //計算總和
	  public static double sum(ArrayList<Double> list) {
	  	double sum = 0;
	  	for(int i = 0;i<list.size();i++)
	  		sum+=list.get(i);
	  	return sum;
	  	
	  } 
}
