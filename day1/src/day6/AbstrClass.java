package day6;

//如果一个类中，有任意个方法是抽象方法，这个类也是抽象类
//先确定抽象方法，再确定抽象类

//如果一个类中有抽象方法，这个类肯定是抽象类   正确 
//如果一个类是抽象类，类中肯定有抽象方法  ?    错误
public abstract   class AbstrClass {
	private String name;
	
	//抽象类的构造函数，给属性赋值
	//被子类构造函数间接调用，给父类属性赋值
	public AbstrClass(){}
	public AbstrClass(String name){
		this.name = name;
	}
	
    //抽象类中，可以正常编写属性

	//写这个类的时候，不清楚方法具体的实现，但是明确应该有这个方法
	//abstract 告诉编译器这个方法不需要实现的 {}
	public abstract void javaPrograme(int a);
	
	//抽象类中，可以有普通方法
	public void method(){
		System.out.println("父类属性值为 :"+this.name);
	}
	
}
