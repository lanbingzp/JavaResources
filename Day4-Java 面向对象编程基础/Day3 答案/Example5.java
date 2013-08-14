package demoDay03;

public class Example5 {

	/**
	 * @author 
	 * 
	 * 编写程序，将一个数组中的元素倒排过来。例如原数组为1，2，3，4，5；
	 *  则倒排后数组中的值为5，4，3，2，1。
	 */
	public static void main(String[] args) {
		
		int []num = new int [10];
		int num1;
		for (int i = 0; i < num.length; i++) {
			num[i] = i+1;
		}
		
		for (int i = 1; i <= num.length/2; i++) {
			 num1 = num[i-1];
			num[i-1] = num[num.length-i];
			num[num.length-i] = num1;
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]+"\t");
		}
	}

}
