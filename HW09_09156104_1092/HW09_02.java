//資一A 09156104 朱可棠
package HW09_09156104_1092;

import java.io.*;
import java.util.*;

public class HW09_Ex02 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File file = new File("C:\\IN0528.txt");
		Scanner input = new Scanner(file);
		ArrayList<String> name = new ArrayList<>();//存選手的名字
		ArrayList<String> team = new ArrayList<>();//存選手的國家
		//讀檔
		while (input.hasNext()) {
			String n = input.next();//先接名字
			name.add(n);
			String t = input.next();//再接國家
			team.add(t);
		}
		input.close();//關檔
		
		for (int i = 0; i < team.size(); i++) {
			System.out.print(team.get(i) + ":");
			int count = 1;//控制人數
			for (int j = i + 1; j < team.size(); j++) {
				//判斷國家是否一樣
				if (team.get(j).equals(team.get(i))) {
					count++;//一樣的話，人數加1
					team.remove(j);//把重複的國家名移除
					j-=1;//因為移除一個國家名，所以位子-1
				}
			}
			System.out.println(count);
		}
	}
}
