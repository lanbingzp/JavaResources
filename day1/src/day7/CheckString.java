package day7;


/**
 * 检查字符串的工具类
 * @author liu
 *
 */
public class CheckString {

	/**
	 * 求一个字符串 str 中，小写字母、大写字母、数字、非字母的个数
	 * @param str
	 */
	public void getCharNumbers(String str){
		int upCount=0;   //大写字母个数
		int lowCount=0; //小写字母个数
		int allCount=0;  //总字母个数
		int oCount = 0;  //数字个数
		//1 把字符串拆散
	    char[] arr =	str.toCharArray();
	    //2 循环数组
	    for (int i = 0; i < arr.length; i++) {
			char c  = arr[i];
			//System.out.println(c);
			allCount++;
			//3 判断每个字符所在范围
			if (c>='A' && c<='Z') {
				upCount++;
			}
			if(c>=97 && c<=122){
				lowCount++;
			}
			if(c>='0' && c<='9'){
				oCount++;
			}
			
		}
	    
	    System.out.println("总字母个数 :"+allCount+"  , 大写字母个数:"+upCount);
	}
	
}





