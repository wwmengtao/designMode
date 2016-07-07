package factory;

import designmode.tools.ALog;
import factory.FactoryInterfaces.ProductInterface;
import factory.FactoryInterfaces.ProductInterfaceAF1;
import factory.FactoryInterfaces.ProductInterfaceAF2;

public class FactoryProducts {
	//����ͨ�ò�Ʒ��
	public static class ConcreteProduct implements ProductInterface{
		String name;
		float mCost;
		public ConcreteProduct(String name,float cost){
			setCost(cost);
			setName(name);
		}
		public void setCost(float fl){
			mCost = fl;
		}
		public void setName(String str){
			name=str;
		}
		public void show(){
			ALog.Log(name+" Cost:"+mCost);
		}
	}
	
	//����򵥹�����Ʒʵ��
	public static class ConcreteProductS1 extends ConcreteProduct{
		public ConcreteProductS1(String name,float cost){
			super(name, cost);
		}
	}
	
	public static class ConcreteProductS2 extends ConcreteProduct{
		public ConcreteProductS2(String name,float cost){
			super(name, cost);
		}
	}
	
	//���幤��ģʽ��Ʒʵ��
	public static class ConcreteProductF1 extends ConcreteProduct{
		public ConcreteProductF1(String name,float cost){
			super(name, cost);
		}
	}
	
	public static class ConcreteProductF2 extends ConcreteProduct{
		public ConcreteProductF2(String name,float cost){
			super(name, cost);
		}
	}
	//������󹤳���Ʒʵ��
	public static class ConcreteProductAF1 implements ProductInterfaceAF1{
		String name;
		float mCost;
		
		public ConcreteProductAF1(String str,float fl){
			setName(str);
			setCost(fl);
		}
		
		public void setCost(float fl) {
			mCost=fl;
		}
	
		public void setName(String str) {
			name=str;
		}
	
		public void show() {
			ALog.Log(name+" Cost:"+mCost);
		}
	}

	public static class ConcreteProductAF2 implements ProductInterfaceAF2{
		String name;
		float mCost;
		
		public ConcreteProductAF2(String str,float fl){
			setName(str);
			setCost(fl);
		}
		
		public void setCost(float fl) {
			mCost=fl;
		}
	
		public void setName(String str) {
			name=str;
		}
	
		public void show() {
			ALog.Log(name+" Cost:"+mCost);
		}
	}	
}
