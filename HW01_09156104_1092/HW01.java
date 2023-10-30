//資一A 09156104 朱可棠
package HW01_09156104_1092;

import java.util.Scanner;

public class HW01_0805_09156104_1092 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter matrix1:");
		// 創第一個2*2的陣列 c
		double[][] c = new double[2][2];
		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c[i].length; j++) {
				c[i][j] = input.nextDouble();
			}
		}
		System.out.println("Enter matrix2:");
		// 創第二個2*2的陣列 d
		double[][] d = new double[2][2];
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				d[i][j] = input.nextDouble();
			}
		}
		// 創陣列e 存副程式的值
		double e[][] = addMatrix(c, d);

		System.out.println("The matrices are added as follows ");
		System.out.println(c[0][0] + " " + c[0][1] + "   " + d[0][0] + " " + d[0][1] + "   " + e[0][0] + " " + e[0][1]);
		System.out.println(c[1][0] + " " + c[1][1] + " + " + d[1][0] + " " + d[1][1] + " = " + e[1][0] + " " + e[1][1]);
	}

	// 用副程式計算兩個陣列相加的總和
	public static double[][] addMatrix(double[][] a, double[][] b) {
		double sum[][] = new double[2][2];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				sum[i][j] = a[i][j] + b[i][j];
			}
		}
		return sum;// 回傳總和
	}
}
