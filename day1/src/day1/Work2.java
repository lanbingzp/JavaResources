package day1;

public class Work2 {

	public static void main(String[] args) {
		//1 得到用户的参数 ，年份
		String year = args[0];
		//2 类型转换，使用系统工具
		int y = Integer.parseInt(year);
		//3 运算并判断结果
		if( (y %4==0 && y%100!=0) || y%400==0 ){
			System.out.println("当前年份是闰年");
		}else{
			System.out.println("当前年份不是闰年");
		}
		

	}

}
