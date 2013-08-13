package day2;

public class Code2 {
	
	int aa = 10;

	public void m1(){
		int aa = 100;
		System.out.println(aa);
	}
	
	
	/**
	 * 计算一天中的毫秒数 和 微秒数
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int 与 long 类型的转换
		//24 默认是 int 类型
		//后面计算的值都放入 int 类型长度的空间中 24*60*60*1000
		//到 24*60*60*1000*1000 时，int 类型内存空间不够，自动截取
		long MICROS_PER_DAY = 24L*60*60*1000*1000; //微秒
		long MILLIS_PER_DAY = 24*60*60*1000; //毫秒
		System.out.println(MICROS_PER_DAY/MILLIS_PER_DAY);
		//证明 float 的赋值
		float f = 20.05f;
		//演示 char 与 int 的关系 
		char c = 'a'; //ASCII 码表为每个字符定义一个数字编号
		int a = 10;
		System.out.println(a+c);
		System.out.println((char)(a+c));
		
		
		
	}

}
