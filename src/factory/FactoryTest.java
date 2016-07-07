package factory;

import designmode.tools.ALog;
import factory.FactoryInterfaces.ProductInterface;
import factory.FactoryInterfaces.ProductInterfaceAF1;
import factory.FactoryInterfaces.ProductInterfaceAF2;
import factory.FactoryProducts.ConcreteProduct;
import factory.FactoryProducts.ConcreteProductAF1;
import factory.FactoryProducts.ConcreteProductAF2;
import factory.FactoryProducts.ConcreteProductF1;
import factory.FactoryProducts.ConcreteProductF2;
import factory.FactoryProducts.ConcreteProductS1;
import factory.FactoryProducts.ConcreteProductS2;

public class FactoryTest {
	//�򵥹���
	//�򵥹��������أ���Ҫ������ֲ�ͬ���
	public class SimpleFactory {
		ConcreteProduct mProduct=null;
		public ConcreteProduct CreateProduct(String type){
			if(null==type)return null;
			switch(type){
			case "1":
				mProduct= new ConcreteProductS1("SimpleFactory_ConcreteProductS1_ID:0x001",1.6f);
				break;
			case "2":
				mProduct= new ConcreteProductS2("SimpleFactory_ConcreteProductS2_ID:0x001",1.6f);
				break;			
			}
			return mProduct;
		}
	}
	
	//��������
	abstract class Factory{
		public abstract ProductInterface CreateProduct(String name,float cost);
	}
	//ÿ�����幤��ֻ����һ�ֲ�Ʒ�����ǲ�Ʒ����ܶ��ʱ���¾��幤������Ҳ�࣬ϵͳ������
	class ConcreteFactoryF1 extends Factory{
		ProductInterface mProduct;
		@Override
		public ProductInterface CreateProduct(String name,float cost) {
			mProduct = new ConcreteProductF1(name,cost);
			return mProduct;
		}
	}
	
	class ConcreteFactoryF2 extends Factory{
		ProductInterface mProduct;
		@Override
		public ProductInterface CreateProduct(String name,float cost) {
			mProduct = new ConcreteProductF2(name,cost);
			return mProduct;
		}
	}
	//���󹤳�
	//���󹤳���������Ʒ��Ⱥ�е����в�Ʒ�����ǲ��������µĲ�Ʒ���ͣ���Ϊ���Ϊ֮ǰ�ĳ��󹤳�ʵ�������޸��鷳
	interface AbstractFactory{
		public ProductInterfaceAF1 createProductAF1(String str,float fl);
		public ProductInterfaceAF2 createProductAF2(String str,float fl);
	}
	//���幤�����������󹤳���������в�Ʒ
	class ConcreteFactoryAF1 implements AbstractFactory{
		ProductInterfaceAF1 mProductA1;
		ProductInterfaceAF2 mProductA2;
		@Override
		public ProductInterfaceAF1 createProductAF1(String str,float fl) {
			mProductA1 = new ConcreteProductAF1(str,fl);
			return mProductA1;
		}

		@Override
		public ProductInterfaceAF2 createProductAF2(String str,float fl) {
			mProductA2 = new ConcreteProductAF2(str,fl);
			return mProductA2;
		}
		
	}
	
	class ConcreteFactoryAF2 implements AbstractFactory{
		ProductInterfaceAF1 mProductA1;
		ProductInterfaceAF2 mProductA2;
		@Override
		public ProductInterfaceAF1 createProductAF1(String str,float fl) {
			mProductA1 = new ConcreteProductAF1(str,fl);
			return mProductA1;
		}

		@Override
		public ProductInterfaceAF2 createProductAF2(String str,float fl) {
			mProductA2 = new ConcreteProductAF2(str,fl);
			return mProductA2;
		}
		
	}
	
	public static void main(String []args){
		new FactoryTest();
	}
	
	public FactoryTest(){
		//�򵥹���
		ALog.Log("�򵥹���");
		ConcreteProduct mProduct = null;
		SimpleFactory mSimpleFactory=new SimpleFactory();
		mProduct = mSimpleFactory.CreateProduct("1");
		mProduct.show();
		mProduct = mSimpleFactory.CreateProduct("2");
		mProduct.show();		
		//����ģʽ
		ALog.Log("����ģʽ");
		ProductInterface mProductInterface = null;
		ConcreteFactoryF1 mConcreteFactoryF1=new ConcreteFactoryF1();
		mProductInterface = mConcreteFactoryF1.CreateProduct("ConcreteFactoryF1_ConcreteProductF1_ID:0x001",1.6f);
		mProductInterface.show();
		ConcreteFactoryF2 mConcreteFactoryF2=new ConcreteFactoryF2();
		mProductInterface = mConcreteFactoryF2.CreateProduct("ConcreteFactoryF2_ConcreteProductF1_ID:0x002",1.8f);
		mProductInterface.show();		
		//���󹤳�
		ALog.Log("���󹤳�");
		ProductInterfaceAF1 mProductInterfaceA1 = null;
		ProductInterfaceAF2 mProductInterfaceA2 = null;
		ConcreteFactoryAF1 mConcreteFactoryAF1=new ConcreteFactoryAF1();
		mProductInterfaceA1 = mConcreteFactoryAF1.createProductAF1("ConcreteFactoryAF1_ConcreteProductAF1_ID:0x011",1.6f);
		mProductInterfaceA2 = mConcreteFactoryAF1.createProductAF2("ConcreteFactoryAF1_ConcreteProductAF2_ID:0x021",2.5f);
		mProductInterfaceA1.show();
		mProductInterfaceA2.show();
		ConcreteFactoryAF2 mConcreteFactoryAF2=new ConcreteFactoryAF2();
		mProductInterfaceA1 = mConcreteFactoryAF2.createProductAF1("ConcreteFactoryAF2_ConcreteProductAF1_ID:0x012",1.8f);
		mProductInterfaceA2 = mConcreteFactoryAF2.createProductAF2("ConcreteFactoryAF2_ConcreteProductAF2_ID:0x022",2.3f);
		mProductInterfaceA1.show();
		mProductInterfaceA2.show();		
	}
}
