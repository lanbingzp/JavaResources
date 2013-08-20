package day8;

import org.junit.Test;

/**
 * 测试包装类中的常用方法
 * @author liu
 *
 */
public class TestPackage {

	@Test
	public void testBoolean(){
		//把基础类转换为引用类型
		boolean b = false;
		Boolean flag = new Boolean(b); //把值放入一个类的构造函数中，生成一个新值
		
		//基本类型不能用  . 操作符访问方法
		//b.
		//引用类型，可以使用 . 操作符号访问方法
		//把引用类型的值，转换为基本类型
		boolean bb = flag.booleanValue();
		
		//把字符串转化为 boolean 
		//只有字符串是 "true" 的，才能转化为 true
		//否则输入任何内容，都转换为 false
		boolean bstring = Boolean.parseBoolean("trUe");
		
		System.out.println("字符串转换为 boolean  :"+bstring);
		System.out.println(bstring);     //println(boolean b)
		//把 boolean 类型数据，转换为 String 类型
		System.out.println(""+bstring);  //println(String s)
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
