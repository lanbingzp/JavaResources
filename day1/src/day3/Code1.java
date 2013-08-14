package day3;

public class Code1 {

	public static void main(String[] args) {
		//了解数组类型与基本类型的区别
		int number = 100;
		//[] 放在 = 赋值符号前面，是一个标示
		//代表赋值符号后面，必须是一个数组 {}
		//[] 可以放在变量名的前面或后面
		//{} 表示一块连续的内存空间，便于用下标索引取值
		//{} 数据类型由 [] 前面的类型确定
		//{} 值的下标索引从 0 开始
		//数组的大小在  创建数组"实例(instance)" 时确定，而不是定义数组"变量"时
		//数组大小由 = 后面决定    int[10] arr
		int[] numberArr= {100,10};  //C 语言风格
		
		//如何定义数组
		String[] arr1;
		byte arr2[];
		
		//如何指定数组长度，为在内存中分配好空间
		arr1 =new String[3]; //new 关键字，JVM 可以在堆内存中分配空间
		
		//如何给数组空间中赋值
		//一个空间，一个空间的分配值
		arr1[0] = "aaa";
		arr1[1] = "bbb";
		arr1[2] = "ccc";
		
		//定义的时候赋值
		arr2 = new byte[]{3,5,9,10};  //Java 语言风格
		

	}

}
