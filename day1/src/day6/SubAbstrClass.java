package day6;

public class SubAbstrClass extends AbstrClass {

	public SubAbstrClass(){
		super();
	}
	
	public SubAbstrClass(String n){
		super(n);
	}
	
	@Override
	public void javaPrograme(int a) {
		System.out.println("这里实现如何进行 java 开发");
	}

}
