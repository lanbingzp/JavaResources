package day6;

public class People {
    //常量名默认全部大写
	public static final double PI=3.1415926;
	
	
	private String name;
	
	public People(){}
	
	public People(String n){
		this.name = n;
		//this.休息();
	}
	
   protected void 休息(){
		System.out.println("睡觉..");
	}
	
	
}
