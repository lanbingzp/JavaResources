package day6;

public class SUNing implements 专业买家 {

	@Override
	public void 确定功率() {
		System.out.println("苏宁建议购买 2 匹的空调");
	}

	@Override
	public void 确定品牌() {
		System.out.println("苏宁建议购买美的空调");
	}

	@Override
	public void 购买() {
		System.out.println("苏宁建议你到最近 的专卖店选购");
	}

}
