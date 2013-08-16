package day5;

import java.util.Arrays;

import org.junit.Test;

public class TestPeople {

	@Test
	public void testCreatePeople(){
		//p 变量在栈区，new People() 在堆区
		//p 指向 new People() 这块内存，叫引用
		People p = new People("小明");
		System.out.println(p);
		System.out.println("name = "+p.getName());
		
		
		People p1 = new People();
		//p1.main({"aa"});
		
		//静态方法，直接通过类名调用，不需要 new
		People.sayHello();
	
		//Arrays.sort();
	}
	
}
