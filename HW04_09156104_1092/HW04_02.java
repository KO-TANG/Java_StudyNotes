//資一A 09156104 朱可棠
package HW04_09156104_1092;

import java.io.*;
import java.util.*;

public class HW04_02 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C:/0326IN.TXT");
		Scanner input = new Scanner(file);
		// 創一個陣列儲存讀入的資料
		String s[][] = new String[11][2];
		// 讀檔
		while (input.hasNext()) {
			for (int i = 0; i < s.length; i++) {
				s[i][0] = input.next();// 第0行的值
				s[i][1] = input.next();// 第1行的值

			}
		}
		// 關檔
		input.close();

		Scanner input2 = new Scanner(System.in);

		String in = input2.next(); // 接收鍵盤輸入的資料
		int count = 0; // 計算中幾張抵用卷
		for (int i = 0; i < s.length; i++) {
			// 判斷是否中獎
			if (in.equals(s[i][1])) {
				count++;
			} else
				continue;
		}
		// 如果count>0 輸出中獎幾張抵用卷、中多少錢
		if (count != 0)
			System.out.println("抽中" + count + "張抵用卷,共" + (count * 50) + "元");
		// 如果count=0 則沒有中獎
		else
			System.out.println("沒抽中");

	}
}
