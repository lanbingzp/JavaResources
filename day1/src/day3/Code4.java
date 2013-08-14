package day3;

public class Code4 {

	public static void main(String[] args) {
		//系统自动给没有赋值的下标 ，赋值
		int length=10;
		int arr[] = new int[length];
		arr[0] = 25;
		arr[4] = 40;
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr["+i+"] = "+arr[i]);
		}
		
		
		
	}

}
