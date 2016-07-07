package factory;

public class FactoryInterfaces {
	//定义通用产品接口
	public static interface ProductInterface{
		public void setCost(float fl);
		public void setName(String str);
		public void show();
	}
	
	//定义抽象工厂产品接口
	public static interface ProductInterfaceAF1 extends ProductInterface{
	
	}
	//定义抽象工厂产品接口
	public static interface ProductInterfaceAF2 extends ProductInterface{
	
	}
}
