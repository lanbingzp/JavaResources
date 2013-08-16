package day5;

/**
 * Super Class 父类
 * @author liu
 *
 */
public class Shap {
	private String name;

	public Shap(){}
	
	public Shap(String name){
		this.name = name;
	}
	
	public void sayHello(){
		System.out.println("Shap 类");
	}
	
	/**
	 * 父类中的这两个方法，目前不完善
	 * @return
	 */
	public int getLength(){
		return 0;
	}
	
	public int getArea(){
		return 0;
	}
	
	
	
	
	
}
