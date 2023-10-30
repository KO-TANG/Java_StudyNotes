//資一A 09156104 朱可棠
package HW10_09156104_1092;
import java.util.Scanner;
public class HW10_Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String date1 = input.next();
		int d1 = days(date1);//第一個日期丟到副程式計算天數
		String date2 = input.next();
		int d2 = days(date2);//第二個日期丟到副程式計算天數
		//大日期-小日期
		if (d1 > d2) {
			System.out.println(d1 - d2 + " days");
		} else {
			System.out.println(d2 - d1 + " days");
		}
	}
	public static int days(String date) {
		int sum = 0;
		String[] array = date.split("/");// 遇到"/"剪開
		int year = Integer.parseInt(array[0]);// 年
		int month = Integer.parseInt(array[1]);// 月
		int day = Integer.parseInt(array[2]);// 日
		// 判斷是否為閏年
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			for (int i = 1; i < month; i++) { //計算輸入的日期和1/1距離天數
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					sum += 31;
				else if (i == 2)
					sum += 29;//閏年2月有29天
				else if (i == 4 || i == 6 || i == 9 || i == 11)
					sum += 30;
			}
		} else {
			for (int i = 1; i < month; i++) {
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					sum += 31;
				else if (i == 2)
					sum += 28;//不是閏年2月有28天
				else if (i == 4 || i == 6 || i == 9 || i == 11)
					sum += 30;
			}
		}
		return sum + day;//回傳距離1/1的天數
	}
}
