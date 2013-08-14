package day3;

import java.util.Collections;
import java.util.Random;   //生成随机数字
import java.util.Arrays;   //对数组搜索、排序的工具类
import java.util.Collections;  //排序类

public class Class3 {

	public static void main(String[] args) {
		//1 定义长度为 10 的数组
		byte arr0[] = new byte[]{20,10,4,50,33,66}; //手动赋值 
		int arr1[] = new int[10]; //自动赋值
		
		//2 生成随机数，并赋值给数组
		Random r = new Random();
		for (int i = 0; i < arr1.length; i++) {
			int bt = (int)r.nextInt(100);
			arr1[i] = bt;
			System.out.println("排序前 arr1["+i+"]  ="+arr1[i]);
		}
		
		/*
		//3 搜索数组中的值
		// 搜索固定的值
		int b1 = Arrays.binarySearch(arr0, (byte)66);
		System.out.println(b1);
		//判断
		if (b1 < 0) {
			System.out.println("该值不在数组中...");
		}else{
			System.out.println("该值在数组中，索引值是 :"+b1);
		}

		//4 复制数组
		int copyArr[] = new int[5];
		copyArr = Arrays.copyOf(arr1, 5);  //只复制前面的部分数组
		for (int i = 0; i < copyArr.length; i++) {
			System.out.println("copyArr["+i+"] = "+copyArr[i]);
		}
		*/
		
		System.out.println("---------------------------");
		
		//5 排序
		Arrays.sort(arr1);    //排序，升序排列
		
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("排序后 arr1["+i+"] = "+arr1[i]);
		}
		
		System.out.println("---------------------------");
		
		//6 倒序排列
		//Arrays.sort(arr1,Collections.reverseOrder());
	}

}
