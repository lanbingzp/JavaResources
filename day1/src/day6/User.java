package day6;

//用户类
public class User {
	//1 找到懂专业标准的人
	private 专业买家 buyer;
	
	public User(){}
	public User(专业买家 b){
		this.buyer = b;
	}
	
	public void 买空调(){
		buyer.确定功率();
		buyer.确定品牌();
		buyer.购买();
	}
	
	
	public void 装空调(){
		
		
	}

}
