package day1;

public class CheckNumber {

	public static void main(String[] args) {
		//1 从命令行得到数字，判断是否是奇数
		String number = args[0];
		//2 转换类型
		int num  = Integer.parseInt(number);
		//3 判断
		if(num%2 != 0){
			System.out.println("数字是奇数");
		}else
		{
			System.out.println("数字是偶数");
		}
		

	}

}
