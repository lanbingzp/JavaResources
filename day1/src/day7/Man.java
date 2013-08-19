package day7;

import day6.People;


/**
 * 演示 Object 类的方法
 * 重写这些方法
 * @author liu
 *
 */
public class Man extends People {
	private String name;

	public Man(){}
	public Man(String name ){
		super();
		this.name = name;
	}
	
	public void method(){
		//不同包的 父子类关系
		//父类中的 public 方法可以被子类访问
		//父类中的 protected 方法可以被子类访问
		super.休息();
		
	}

	
	@Override
	public int hashCode() {
		//hash 算法在父类中已封装好，不需要重写
		return super.hashCode();
	}
	

	@Override
	public boolean equals(Object obj) {
		boolean flag = false;  //定义返回值
		//判断参数是否为 null
		if(obj == null){
			return flag;
		}
		//判断参数是否是自己
		if(obj == this){
			return true;
		}
		//重写方法，明确比较哪些属性值
		if(obj instanceof Man){
			Man m = (Man)obj;
			//内容一样，返回 true
			if(this.name == m.name){
				flag = true;
			}
		}
		return flag;
	}

	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Man m = new Man();    //新分配一块内存，保存新的对象 
		m.name  = this.name;  //把当前类属性，赋值给一个新建的内存对象
 		return m;
	}
	

	@Override
	public String toString() {
		//用制定字符串，美化对象输出
		return "当前对象中属性 nam ="+this.name;
	}
	
	
	
	/**
	 * 不需要重写，当 JVM 试图清理当前类对象的时候，会运行 finalize()
	 * 可以制定，如何释放该对象所占用的内存
	 */

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	
	
	
	
	
	
}
