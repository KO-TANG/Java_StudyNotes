//資一A 09156104 朱可棠
package HW08_09156104_1092;
import java.text.*;
import java.util.Scanner;
public class HW08_Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();//使用者輸入的值
		String binary = Integer.toBinaryString(num);//轉二進位
		double length = binary.length();//二進位的值的長度
		double count = 0;
		//計算位元1的個數
		for(int i = 0;i<length;i++) {
			if(binary.charAt(i)=='1')
				count++;
			else
				continue;
		}
		System.out.println("二進位:"+binary); 
		System.out.println("總長"+(int)length+"個位元，位元1有"+(int)count+"個");
		//計算漢明密度
		double d = count/length;
		DecimalFormat df = new DecimalFormat("0.0##");
		System.out.println("漢明密度:"+df.format(d));

	}

}
