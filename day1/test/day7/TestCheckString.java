package day7;

import org.junit.Test;

public class TestCheckString {

	@Test
	public void testGetCharNumbers(){
		String str = new String("hjashu^&^#$RHJdw348389JHDFJSD*&Yjksjkdfjw");
		CheckString cs = new CheckString();
		//调用对象中的方法，开始工作
		cs.getCharNumbers(str);
	}
	
}
