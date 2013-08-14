package day3;

import java.util.Random;

public class Code2 {

	/**
	 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，
	 * 然后求出所有元素的最大值，最小值，平均值，和值，并输出出来。	
	 * @param args
	 */
	public static void main(String[] args) {
		//1、定义一个int型的一维数组，包含10个元素
		int arr[]=new int[10];
		
		//2、分别赋一些随机整数
		//两种方法可以得到随机数字，都需要用到 java 提供的工具类
		//方法一，使用 java.lang.Math 数学类,基本语言包，默认不需要导入
		/*
		for (int i = 0; i < 10; i++) {
			double d = Math.random();//生成 0.0-1.0 之间的数字
			int num = (int)(d*100); //小数点右移 2 位,强制转换为整数
			//把一个随机数字赋值给数组中的一个下标
			arr[i] = num;
		}
		*/
		
		//方法二，使用 java.util.Random 类，需要手动导入
		//种子只是随机算法起源数字，与生成随机数 的 区间没有关系
		Random r = new Random(10l);
		for (int i = 0; i < 10; i++) {
			//int num = r.nextInt();  //生成 -2(31) - +2(31)
			int num = r.nextInt(100); //生成 [0-100) 之间的随机数 
			System.out.println(num);
			arr[i] = num;
		}
		
		
		//3、求出所有元素的最大值，边界判断
		//arr.length  得到数组的长度，边界 10
		//如果越界  ArrayIndexOutOfBoundsException
		int sum = 0;   //和
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		System.out.println("数组元素和 :"+sum);
		
		
		
	}

}
