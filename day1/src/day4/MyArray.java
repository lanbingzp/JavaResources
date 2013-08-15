package day4;

import javax.swing.text.StyledEditorKit.ForegroundAction;

/**
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数， 然后求出所有元素的最大值，最小值，平均值，和值，并输出出来。
 * 
 * @author liu
 * 
 */
public class MyArray {

	private int[] arr;

	/**
	 * 第一个构造函数，不带参数
	 * 给数组 arr 属性赋值 10 个
	 */
	public MyArray() {
		arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			// System.out.print(arr[i]+"  ");
		}
	}
	
	/**
	 * 第二个构造函数，带一个参数
	 * @param length 数组的初始化长度
	 */
	public MyArray(int length){
		arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			// System.out.print(arr[i]+"  ");
		}
	}
	

	/**
	 * 给数组赋随机数的值
	 */
	public void setArrayValues(int length) {
		arr = new int[length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			// System.out.print(arr[i]+"  ");
		}
	}
	
	/**
	 * 打印输出数组中所有的数据
	 */
	public void printArray(){
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] ="+arr[i]);
		}
	}

	/**
	 * 求数组中所有元素的最大值，输出
	 * 
	 * @return
	 */
	public int getMax() {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				int temp = arr[i];
				// 交换两个数字
				max = max ^ temp;
				temp = max ^ temp;
				max = max ^ temp;
			}
		}
		System.out.println("数组中最大值为 :" + max);
		return max;
	}

	/**
	 * 求数组中所有元素的最小值，输出
	 * 
	 * @return
	 */
	public int getMin() {
		return 0;
	}

	public int getSum() {
		return 0;
	}

	public int getAvg() {
		return 0;
	}

}
