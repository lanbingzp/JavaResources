package day1;

public class Demo1 {
	//定义变量
	// 类型   变量名 = 变量值;
	String name ="小明";
	int age = 25;
	char sex = 'm';
	
	static int sum;  //和
	static int sub;  //差
	static int ji;   //积
	static int sang; //商
	
	public static void main(String[] args){
		//定义几个变量，运算
		int a = 10;
		int b = 20;
		
		sum = a+b; //和
		sub = a-b;
		ji = a *b;
		sang = a/b;
		
		System.out.println("a + b ="+sum);
		System.out.println("a - b ="+sub);
		System.out.println("a * b ="+ji);
		System.out.println("a / b ="+sang);
		
		
	}
	
	

}
