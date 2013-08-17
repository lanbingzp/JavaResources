package day6;

import org.junit.*;
import day5.*;

public class TestPeople {

	@Test
	public void test1(){
		//不涉及到多态,不需要运行时判断该调用哪个方法
		People p1 = new People();
		p1.休息();
		
		Study p2 = new Study();
		p2.休息();
		
		//涉及到多态
		//如果子类重写父类中的方法，多态调用的时候，自动调用子类中 重写过的方法
		//父类中的方法  被覆盖  --> 失效
		People p3 =  new Study();
		//运行时判断，父子类中有同名的方法 ，自动调用子类中的方法
		p3.休息();  //父类中的方法
		//p3.运动()  //父类中没有定义过的方法，无法被调用到，圈定了父中的方法
		
		
		
		
		
	}
	
	
	//接口是否可以作为父类
	public void test2(){
		//父类类型，引用子类对象
		Car c1 = new FlyCar();
		
		//接口也可以作为父类类型，引用子类对象
		Fly f1 = new FlyCar();
		
	}
	
	
	//策略模式实际应用
	@Test
	public void test3(){
		//先创建买家对象,在用户外部，选定一个
		专业买家 b1 = new JD();
		专业买家 b2 = new SUNing();
		
		User u = new User(b2);
		u.买空调();
		
	}
	
	
	//测试抽象类的用途
	@Test
	public void test4(){
		//抽象类，作为父类，由子类实例化对象
		AbstrClass a = new SubAbstrClass();
		a.javaPrograme(2);
		
		//抽象类的属性，通过子类构造函数，间接赋值
		AbstrClass b = new SubAbstrClass("小强");
		b.method();
		
	}
	
	
	
}
