//資一A 09156104 朱可棠
package HW08_09156104_1092;
import java.util.Scanner;
public class HW08_Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String time1 = input.next();
		String time2 = input.next();
		int hour1 = Integer.parseInt(time1.substring(0,2))*60*60;//把小時換成秒
		int min1 = Integer.parseInt(time1.substring(3,5))*60;//把分鐘換成秒
		int sum1 = hour1+min1+Integer.parseInt(time1.substring(6));
		
		int hour2 = Integer.parseInt(time2.substring(0,2))*60*60;//把小時換成秒
		int min2 = Integer.parseInt(time2.substring(3,5))*60;//把分鐘換成秒
		int sum2 = hour2+min2+Integer.parseInt(time2.substring(6));
		
		int d;
		int hour ;
		int min ;
		int sec ;
		//判斷哪個時間比較晚(晚-早)
		if(sum1>sum2) {
			d = sum1-sum2;
			hour = d/60/60;
			System.out.printf("%02d:",hour);
			min = d/60%60;
			System.out.printf("%02d:",min);
			sec = d%60;
			System.out.printf("%02d",+sec);
		}
		else if(sum2>sum1) {
			d = sum2-sum1;
			hour = d/60/60;
			System.out.printf("%02d:",hour);
			min = d/60%60;
			System.out.printf("%02d:",min);
			sec = d-(hour*3600+min*60);
			System.out.printf("%02d",sec);
		}
		else if(sum2==sum1) {
			System.out.print("00:00:00");
		}
	}

}
