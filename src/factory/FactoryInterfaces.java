package factory;

public class FactoryInterfaces {
	//����ͨ�ò�Ʒ�ӿ�
	public static interface ProductInterface{
		public void setCost(float fl);
		public void setName(String str);
		public void show();
	}
	
	//������󹤳���Ʒ�ӿ�
	public static interface ProductInterfaceAF1 extends ProductInterface{
	
	}
	//������󹤳���Ʒ�ӿ�
	public static interface ProductInterfaceAF2 extends ProductInterface{
	
	}
}
