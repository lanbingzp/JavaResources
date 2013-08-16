package day5;

import org.junit.Test;

public class TestShap {

	@Test
	public void testRect(){
		Rect r1  = new Rect(1200,400,"矩形");
		Rect r2  = new Rect(100,200,"矩形");
		Rect r3  = new Rect(500,900,"矩形");
		Rect r4  = new Rect(300,700,"矩形");
		
		Circle c1 = new Circle(100,"圆形");
		Circle c2 = new Circle(140,"圆形");
		Circle c3 = new Circle(360,"圆形");
		Circle c4 = new Circle(1000,"圆形");
		
		System.out.println(r1);
		
		//把上述8 个对象放入同一个数组中，乱序
		Shap[] arr = new Shap[]{c1,r4,c3,r1,r3,c2,r2,c4};
		
		for (int i = 0; i < arr.length; i++) {
			Shap temp = arr[i];
			//判断具体是哪个子类的类型
			if (temp instanceof Rect) {
				System.out.println("矩形");
			}
			if (temp instanceof Circle) {
				System.out.println("圆形");
			}
			
			//子类直接调用父类方法
			System.out.println("length  = "+temp.getLength()+ "  area ="+temp.getArea());
		}
		
		
	}
	
	
	
	@Test
	public void testZheng(){
		Zheng z = new Zheng();
		z.sayHello();
	}
	
	
	
	
	
	
	
	
	
	
}
