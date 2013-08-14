package demoDay03;

import java.util.Random;

public class Example4 {

	/**
	 * @author 
	 * 
	 * 40个成绩按照从高到低的顺序输出出来
	 */
	public static void main(String[] args) {

		int number = 40;
		int[] stu = new int[number];
		int num;
		Random r = new Random(); // 随机数函数 
		for (int i = 0; i < number; i++) {
			stu[i] = r.nextInt(100);
		}

		for (int i = 0; i < stu.length; i++) {   //快速排序法

			for (int j = 0; j < stu.length; j++) {

				if (stu[i] < stu[j]) {  //一个个比较如果碰到比stu小的就调换
					num = stu[i];
					stu[i] = stu[j];
					stu[j] = num;
				}
			}
		}
		
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i]+"\t");
		}
	}

}
