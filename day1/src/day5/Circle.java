package day5;

public class Circle extends Shap {
	private int r;
	
	public Circle(){}
	
	public Circle(int r,String name) {
		super(name);
		this.r = r;
	}
	/////////////////////////
	public int getLength(){
		return (int) (2*r*Math.PI);
	}
	
	public int getArea(){
		return (int) (Math.PI*r*r);
	}
	
	
}
