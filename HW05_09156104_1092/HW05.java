//資一A 09156104 朱可棠
package HW05_09156104_1092;

import java.util.Scanner;

public class HW05_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string:");
		String myString = input.next().toLowerCase(); // 創一個字串，接收使用者輸入的值，全部轉小寫
		// 字串轉字元
		for (int i = 0; i < myString.length(); i++) {
			if (myString.charAt(i) == '-') {
				System.out.print("-");
			} else
				System.out.print(getNumber(myString.charAt(i)));
		}
	}
	//把英文轉成數字
	public static int getNumber(char uppercaseLatter) {
		int Number = 0;
		if (uppercaseLatter == 'a' || uppercaseLatter == 'b' || uppercaseLatter == 'c') {
			Number = 2;
		} else if (uppercaseLatter == 'd' || uppercaseLatter == 'e' || uppercaseLatter == 'f') {
			Number = 3;
		} else if (uppercaseLatter == 'g' || uppercaseLatter == 'h' || uppercaseLatter == 'i') {
			Number = 4;
		} else if (uppercaseLatter == 'j' || uppercaseLatter == 'k' || uppercaseLatter == 'l') {
			Number = 5;
		} else if (uppercaseLatter == 'm' || uppercaseLatter == 'n' || uppercaseLatter == 'o') {
			Number = 6;
		} else if (uppercaseLatter == 'p' || uppercaseLatter == 'q' || uppercaseLatter == 'r'
				|| uppercaseLatter == 's') {
			Number = 7;
		} else if (uppercaseLatter == 't' || uppercaseLatter == 'u' || uppercaseLatter == 'v') {
			Number = 8;
		} else if (uppercaseLatter == 'w' || uppercaseLatter == 'x' || uppercaseLatter == 'y'
				|| uppercaseLatter == 'z') {
			Number = 9;
		} else {
			Number = uppercaseLatter - 48;//char的'0'是從48開始，所以要減48
		}
		return Number;
	}
}
