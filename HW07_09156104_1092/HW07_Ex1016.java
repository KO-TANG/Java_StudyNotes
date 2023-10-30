//資一A 09156104 朱可棠
package HW07_09156104_1092;

import java.math.BigDecimal;

public class HW07_Ex1016 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//50 decimal digits
		BigDecimal value = new BigDecimal("10000000000000000000000000000000000000000000000000");
		BigDecimal d1 = new BigDecimal(2);
		BigDecimal d2 = new BigDecimal(3);
		BigDecimal a = new BigDecimal(0);
		int count = 0;
		//找可以被2或3整除的數
		while (count < 15) {
			if (value.remainder(d1).equals(a) || value.remainder(d2).equals(a))
			System.out.println(value);
			value = value.add(BigDecimal.ONE);//加1
			count++;
		}
	}
}
