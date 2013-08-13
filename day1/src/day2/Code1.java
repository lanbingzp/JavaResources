package day2;

public class Code1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for (int i = 1; i < 10; i++)	{
			for (int j = 1; j <= i; j++) {
				System.out.print(i+" * "+j+" = "+ (i*j)+"\t");
				if(i==j){
					System.out.println();
				}
			}
		}
		
		
		
		//求 500 内完备数
		int sum = 500;
		int count;
		for (int i = 1; i <=sum; i++) {
			count = 0;
			
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					//整除，因数 ,求和
					count += j;
				}
				
				if (count > i) {
					continue;
				}
			}
			
			
			if (count == i) {
				System.out.println(i+"\t\t");
			}
		}
		*/
		
		//\u0022  双引号的 unicode 转义字符
		System.out.println("a\u0022+12+\u0022 ");
		
	}

}
