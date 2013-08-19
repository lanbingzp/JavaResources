package day6;

/**
 * 学员类，演示方法的重载
 * @author liu
 *
 */
public class Study extends People{
	
	//学习某一门课程
	public void studyClass(String className){
		System.out.println("正在学习 "+className);	
	}
	
	public void studyClass(String className,int time){
		if (time == 1) {
			System.out.print("现在是暑假,");
		}
		if (time ==2) {
			System.out.print("现在是上学期,");
		}
		
		System.out.println("正在学习 "+className);	
		
		//System.out.println(x);
	}
	
	
	//重写父类中的方法
	/*
	public void 休息(){
		System.out.println("玩游戏..");
	}
	*/
	
	//写一个父类中没有的方法
	public void 运动(){
		System.out.println("喜欢打羽毛球....");
		//子类中调用父类的方法
		//父类对象 super
		super.休息();
	}
	
}
