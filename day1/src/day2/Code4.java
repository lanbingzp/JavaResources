package day2;

public class Code4 {

	public static void main(String[] args) {
		//输入一个成绩，判断该成绩是否符合标准 A B C D E
		//输入判断 
		if(args.length == 0){
			System.out.println("忘记输入成绩！重新输入后再次运行.");
			//break; //终止程序
			return;
		}
		//得到输入成绩
		String number = args[0]; //"B"
		int num = Integer.parseInt(number);
		
		//把 "B" 字符串类型，转换为 'B' 字符类型
		//char c = number.charAt(0);
		 //'B'
		switch (num) {
		case 100:
        case 90:
			System.out.println("A");
			break;
        case 80:
			System.out.println("B");
			break;
        case 70:
        		System.out.println("C");
        		break;
        case 60:
        		System.out.println("D");
        		break;
		default:
			System.out.println("F");
			break;
		}
		
		//break 跳出上面的代码块后，按顺序执行这里的代码
		System.out.println("break 后会输出");
		
		
		//continue 跳转，可以跳转到制定的代码行
		
		
		return;
		//System.out.println("hhh");
	}

}
