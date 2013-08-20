package day7;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestMan {
	
	@Test
	public void testHashCode(){
		//hashCode 是对象在内存中的地址 按照 哈希算法 生成的结果
		Man m1 = new Man();
		System.out.println("m1 = "+m1.hashCode());
		
		Man m2 = new Man();
		System.out.println("m1 == m2"+(m1==m2));
		//System.out.println("m2 = "+m2.hashCode());
		
		//m1 指向的内存地址赋值给 m2
		//m1 m2 指向同一块内存地址
		m2 = m1;
		System.out.println("m2 = "+m2.hashCode());
		System.out.println("m1 == m2"+(m1==m2));
		
		//hashCode 作用，判断两个对象是否在同一块内存中
		//a == b，如果 a b 指向同一块，那么 结果为 true
		String c = new String("hello");
		String a = "hello";
		String b = "hello";
		
		boolean flag = a == b;
		System.out.println(flag);
		System.out.println("a hashCode ="+a.hashCode());
		System.out.println("b hashCode ="+b.hashCode());
		System.out.println("c hashCode ="+c.hashCode());
	}

	
	@Test
	public void testEquals(){
		Man m1 = new Man("小明");
		Man m2 = new Man("小明");
		Man m3 = null;
		Man m4 = m1;
		
		//m1 m2 内存地址不一样  == false
		boolean flag = m1.equals(m2);
		boolean flag2 = m1.equals(m4);
		
		System.out.println(flag);
	}

	
	@Test
	public void testToString(){
		Man m1= new Man("小明");
		System.out.println(m1); //默认调用 toString()
		//输出的默认格式  类型名称 @ hashCode
		System.out.println(m1.toString());
	}
	
	@Test
	public void testClone(){
		Man m = new Man("小雨");
		try {
			Object o = m.clone();
			System.out.println(o);
			System.out.println("m == o    :"+(m==o));
			System.out.println("m.equals(o) :"+m.equals(o));
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Test
    public void test1(){
    		List<String> list = new ArrayList<String>();
    		list.add("abc");
    		list.add("bdw");
    		list.add("ages");
    		list.add("dfsae");
    		
    		for (int i = 0; i < list.size(); i++) {
				
		}
    		
    		for (String string : list) {
				if (string.contains("a")) {
					list.remove(string);
				}
		}
    		
    }


}
