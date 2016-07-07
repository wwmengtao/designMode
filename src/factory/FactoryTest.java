package factory;

import designmode.tools.ALog;

public class FactoryTest {
	//简单工厂
	//简单工厂任务繁重，需要处理多种不同情况
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
	
	//工厂方法
	//
	abstract class Factory{
		public abstract ProductInterface CreateProduct(String name,float cost);
	}
	//每个具体工厂只生产一种产品，但是产品种类很多的时候导致具体工厂种类也多，系统开销大
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
	//抽象工厂
	//抽象工厂能生产产品族群中的所有产品，但是不能增加新的产品类型，因为这会为之前的抽象工厂实例带来修改麻烦
	interface AbstractFactory{
		public ProductInterfaceAF1 createProductAF1(String str,float fl);
		public ProductInterfaceAF2 createProductAF2(String str,float fl);
	}
	//具体工厂能生产抽象工厂定义的所有产品
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
		//简单工厂
		ALog.Log("简单工厂");
		SimpleFactory mSimpleFactory=new SimpleFactory();
		ConcreteProduct mProduct = null;
		mProduct = mSimpleFactory.CreateProduct("1");
		mProduct.show();
		mProduct = mSimpleFactory.CreateProduct("2");
		mProduct.show();		
		//工厂模式
		ALog.Log("工厂模式");
		ConcreteFactoryF1 mConcreteFactoryF1=new ConcreteFactoryF1();
		ConcreteFactoryF2 mConcreteFactoryF2=new ConcreteFactoryF2();
		ProductInterface mProductInterface = mConcreteFactoryF1.CreateProduct("ConcreteFactoryF1_ConcreteProductF1_ID:0x001",1.6f);
		mProductInterface.show();
		mProductInterface = mConcreteFactoryF2.CreateProduct("ConcreteFactoryF2_ConcreteProductF1_ID:0x002",1.8f);
		mProductInterface.show();		
		//抽象工厂
		ALog.Log("抽象工厂");
		ProductInterfaceAF1 mProductInterfaceA1;
		ProductInterfaceAF2 mProductInterfaceA2;
		ConcreteFactoryAF1 mConcreteFactoryAF1=new ConcreteFactoryAF1();
		ConcreteFactoryAF2 mConcreteFactoryAF2=new ConcreteFactoryAF2();
		mProductInterfaceA1 = mConcreteFactoryAF1.createProductAF1("ConcreteFactoryAF1_ConcreteProductAF1_ID:0x011",1.6f);
		mProductInterfaceA2 = mConcreteFactoryAF1.createProductAF2("ConcreteFactoryAF1_ConcreteProductAF2_ID:0x021",2.5f);
		mProductInterfaceA1.show();
		mProductInterfaceA2.show();
		mProductInterfaceA1 = mConcreteFactoryAF2.createProductAF1("ConcreteFactoryAF2_ConcreteProductAF1_ID:0x012",1.8f);
		mProductInterfaceA2 = mConcreteFactoryAF2.createProductAF2("ConcreteFactoryAF2_ConcreteProductAF2_ID:0x022",2.3f);
		mProductInterfaceA1.show();
		mProductInterfaceA2.show();		
	}
}
