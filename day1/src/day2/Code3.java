package day2;

public class Code3 {

	public static void main(String[] args) {
		//交换两个变量值
		int leftHand = 10;
		int rightHand = 8;
		System.out.println("交换前，左手 :"+leftHand+ " ,右手:"+rightHand);
		/*
		//方法一,定义第三个变量，交换
		int temp = 0;
		temp = leftHand;
		leftHand = rightHand;
		rightHand = temp;
		
		//方法二,不定义第三个量，用 + - 
		leftHand = leftHand + rightHand; //18
		rightHand = leftHand - rightHand; //10
		leftHand =  leftHand - rightHand; //8
		*/
		
		//方法三，不定义第三个变量，用 ^
		leftHand = leftHand ^ rightHand;
		rightHand = leftHand ^ rightHand;
		leftHand = leftHand ^ rightHand;
		
		
		System.out.println("交换后，左手 :"+leftHand+ " ,右手:"+rightHand);
	}

}
