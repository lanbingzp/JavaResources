package day5;

/**
 * extends 关键字表示两个类的继承
 * 
 * @author liu
 *
 */
public class Rect extends Shap {
	//属性都定义在顶部
	private int width;
	private int height;
	
	//默认构造函数
	public Rect(){}

	//带参构造函数,给属性赋初始值
	public Rect(int width, int height,String name) {
		//super 代表父类
		//写法一 super.   super 代表一个父类对象
		//写法二 super(); super() 代表父类中的构造方法
		//在子类构造函数的首行，写上父类的构造函数，目的初始化父类属性值
		super(name);
		//this 肯定应该是一个对象
		//this 代表是当前类的对象->new Rect()
		//为了在当前类中，方便的调用已有的属性和方法
		//强调属性是当前类中的属性
		this.width = width;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + "]";
	}

	/////////////////////////////////
	//直接调用父类中的方法，无法得到长方形的周长面积
	//只能自己去实现。要求把父类中定义的方法，重新写一遍
	//方法的重写
	//多态
	public int getLength(){
		return 2*(this.width+this.height);
	}
	
	public int getArea(){
		return this.width*this.height;
	}
	
	
	
	
	
	
}
