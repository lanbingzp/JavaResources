package day6;

public class Aaaa {

	public static void main(String[] args) {
		//同一个包，定义另外一个类的对象，不需要导入
		JD jd = new JD();
		
		//测试  访问修饰符
		People p = new People();
		p.休息(); //同一个包中，protected default public 修饰可以访问
	
		//父子类之间的关系
		Study stu = new Study();
		stu.休息();
	}

}
