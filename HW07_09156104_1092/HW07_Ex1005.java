//資一A 09156104 朱可棠
package HW07_09156104_1092;

import java.util.Scanner;

public class HW07_Ex1005 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//提示使用者輸入正整數
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		int temp;
		temp = number;
		StackOfIntegers stack = new StackOfIntegers();
		//找質因數
		int k = 2;
		while (number>=k) {
			if (number % k == 0) {
				stack.push(k);
				number = number / k;
			} else 
				k++;
		}
		System.out.print("The factors for "+temp +" is ");
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}
