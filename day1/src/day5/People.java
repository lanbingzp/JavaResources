package day5;

/**
 * 代表人的类，使用这个类作为模版
 * 可以创建出无数个 人 的对象
 * @author liu
 *
 */
public class People {
	private String name;
	private int age;
	private String sex;
	private static String likes; //爱好
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public static String getLikes() {
		return likes;
	}

	public static void setLikes(String likes) {
		People.likes = likes;
	}

	//只要创建类，肯定有一个隐藏的构造函数
	//如果你写了带参的构造函数，默认的隐式构造函数失效，
	//此时，规定，只要有带参构造，肯定要配套不带参的构造
	public People(){}
	
	/**
	 * 带参数的构造函数，给类的成员属性 赋值
	 * @param n
	 */
	public People(String n){
		name = n;
	}
	
	public People(String n,int a){
		name = n;
		age = a;
	}
	
	/**
	 * static 关键字，作用是在代码加载时候，自动在 静态代码区
	 * 分配内存，这样的方法，不需要 new 分配内存，就可以运行
	 */
	public static void sayHello(){
		System.out.println("Hello");
		likes = "学习";
		//name = "小强";  //static 方法内部，只能调用 static 变量
	}
	
	public void play(){
		likes = "逛街";
	}
	
	//程序的入口
	public static void main(String[] args){
		
		
	}

}
