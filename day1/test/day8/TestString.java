package day8;

import org.junit.Test;

/**
 * 测试字符串类
 * @author liu
 *
 */
public class TestString {

	@Test
	public void testCreateString(){
		//字符串的创建
		//方法二
		String s2 = new String("hello");
				
		
		
		//方法一
		String s1 = "hello";
		int i = 10; 
		
		
		String s3 = new String("hello");
		
		//比较 hashCode 判断变量是否指向同一块内存
		if (s1.hashCode() == s2.hashCode()) {
			System.out.println("a s1  s2 指向同一块内存");
		}
		
		//使用 ==  判断变量是否指向同一块内存
		if (s1 == s2) {
			System.out.println("b s1  s2 指向同一块内存");
		}
		//s2 s3 在堆区中的内存地址是不一样的 new ,字符串内容都在常量区中
		//== 比较堆内存中的地址
		if (s2 == s3) {
			System.out.println("c s2  s3 指向同一块内存");
		}
		//equals() 比较字符常量区中的内容
		if (s2.equals(s3)) {
			System.out.println("d s2  s3 中内容相同");
		}
		
		
	}

	@Test
	public void testStringMethods(){
		//测试字符串的基本方法
		String str = "hellojavaibmadjavafhweriskjq22";
		
		//charAt  返回指定索引处的 char 值
		//把一个字符串看作一个字符数组，里面每个字母都有下标
		//下标与数组一致， 从 0  开始
		char c = str.charAt(4);
		System.out.println("index = 4 对应的字符为 :"+c);
		
		//根据字符，找索引位置
		//判断字符串中是否包含 java
		CharSequence cs = new String("java");
		boolean b = str.contains(cs);
		if (b) {
			System.out.println("字符串中，包含 java 的");
			//如果有 java ,问开始的索引是
			int begin = str.indexOf("java");
			System.out.println("java 在字符串中，开始的索引为 :"+begin);
			
			//结束的索引是
			//最后一个字符的索引
			int length = str.length();
			int lastIndex = length-1;
			//在字符串中，找符合条件的子串最后一次出现的位置
			int last = str.lastIndexOf("java");
			System.out.println("java 在字符串中，最后的索引为 :"+last);
			
			//把 java 从整个字符串中截取出来
			String s1 = str.substring(begin);
			System.out.println("第一次截取后的字符串 :"+s1);
			String s2 = str.substring(begin,begin+4); //java 字符长度为 4 
			System.out.println("第二次截取后的字符串 :"+s2);
		}
		
		//字符串的拆分,按照指定的字符，拆分成数组
		String str2 = "hello_havhjs_iuwer_hjewhj_shj87";
		String [] arr = str2.split("h"); //split("") 正则表达式
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	//统计指定字符串出现的次数
	//String s = "hellojavaIbmjavaOraclejavasunjavaokjava";
	
	@Test
	public void testRegex(){
		String str ="14";
		//判断字符串中内容是否是数字
		//\d 判断一个字符，是否是数字的正则表达式
		boolean b = str.matches("\\d\\d");
		System.out.println(b);
		
		str.matches("."); //判断该字符串是否只有一个字符           false
		str.matches("\\d*"); //判断字符串第一个是数字、后面任意个   true
		str.matches("\\d?"); //判断字符串第一个是数字，后面有 0 或 1个字符 true
		
		//手机号码长度验证?
		str.matches("\\d{11}"); //必须有 11 个数字
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
