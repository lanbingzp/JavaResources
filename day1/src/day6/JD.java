package day6;

public class JD implements 专业买家 {

	@Override
	public void 确定功率() {
		System.out.println("京东专业建议，购买 1.5 匹空调");
	}

	@Override
	public void 确定品牌() {
		System.out.println("京东建议，购买 格力空调.");
	}

	@Override
	public void 购买() {
		System.out.println("京东购买，2天内 送货上门");
	}

}
