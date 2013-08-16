package day5;

/**
 * 飞机的标准
 * @author liu
 *
 */
public interface Fly {
	
	//这里只定义方法的输入、输出。没有实现功能
	//需要由 实现借口的类实现具体功能
	public void 加速(int speed);
	public void 降落();
	
}
