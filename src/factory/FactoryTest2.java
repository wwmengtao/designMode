package factory;

import designmode.tools.ALog;

public class FactoryTest2 {
	//工厂方法
	class Product{
		String name;
		float mCost;
		protected void setCost(float fl){
			mCost = fl;
		}
		protected void setName(String str){
			name=str;
		}
		protected void show(){
			ALog.Log(name+" Cost:"+mCost);
		}
	}
	
	class concreteProductF1 extends Product{
		public concreteProductF1(String name,float cost){
			setCost(cost);
			setName(name);
		}
	}
	
	class concreteProductF2 extends Product{
		public concreteProductF2(String name,float cost){
			setCost(cost);
			setName(name);
		}
	}
	
	abstract class Factory{
		public abstract Product CreateProduct(String name,float cost);
		public void sale(){
			ALog.Log("Sale the product!");
		}
	}
	//每个具体工厂只生产一种产品
	class concreteFactoryF1 extends Factory{
		Product mProduct;
		@Override
		public Product CreateProduct(String name,float cost) {
			mProduct = new concreteProductF1(name,cost);
			return mProduct;
		}
	}
	
	class concreteFactoryF2 extends Factory{
		Product mProduct;
		@Override
		public Product CreateProduct(String name,float cost) {
			mProduct = new concreteProductF2(name,cost);
			return mProduct;
		}
	}
	//抽象工厂
	interface Product1{
		public void setCost(float fl);
		public void setName(String str);
		public void show();
	}
	
	interface Product2{
		public void setCost(float fl);
		public void setName(String str);
		public void show();
	}
	
	class concreteProductAF1 implements Product1{
		String name;
		float mCost;
		
		public concreteProductAF1(String str,float fl){
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
	
	class concreteProductAF2 implements Product2{
		String name;
		float mCost;
		
		public concreteProductAF2(String str,float fl){
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
	
	//抽象工厂能生产所有产品
	interface abstractFactory{
		public Product1 createProduct1(String str,float fl);
		public Product2 createProduct2(String str,float fl);
	}
	//具体工厂能生产抽象工厂定义的所有产品
	class concreteFactoryAF1 implements abstractFactory{
		Product1 mProduct1;
		Product2 mProduct2;
		@Override
		public Product1 createProduct1(String str,float fl) {
			mProduct1 = new concreteProductAF1(str,fl);
			return mProduct1;
		}

		@Override
		public Product2 createProduct2(String str,float fl) {
			mProduct2 = new concreteProductAF2(str,fl);
			return mProduct2;
		}
		
	}
	
	class concreteFactoryAF2 implements abstractFactory{
		Product1 mProduct1;
		Product2 mProduct2;
		@Override
		public Product1 createProduct1(String str,float fl) {
			mProduct1 = new concreteProductAF1(str,fl);
			return mProduct1;
		}

		@Override
		public Product2 createProduct2(String str,float fl) {
			mProduct2 = new concreteProductAF2(str,fl);
			return mProduct2;
		}
		
	}
	
	public static void main(String []args){
		new FactoryTest2();
	}
	
	public FactoryTest2(){
		//工厂模式
		Product mProduct;
		concreteFactoryF1 mconcreteFactoryF1=new concreteFactoryF1();
		concreteFactoryF2 mconcreteFactoryF2=new concreteFactoryF2();
		mProduct = mconcreteFactoryF1.CreateProduct("concreteFactoryF1_concreteProductF1_ID:0x001",1.6f);
		mProduct.show();
		mProduct = mconcreteFactoryF2.CreateProduct("concreteFactoryF2_concreteProductF1_ID:0x002",1.8f);
		mProduct.show();		
		//抽象工厂
		Product1 mProduct1;
		Product2 mProduct2;
		concreteFactoryAF1 mconcreteFactoryAF1=new concreteFactoryAF1();
		concreteFactoryAF2 mconcreteFactoryAF2=new concreteFactoryAF2();
		mProduct1 = mconcreteFactoryAF1.createProduct1("concreteFactoryAF1_concreteProductAF1_ID:0x011",1.6f);
		mProduct2 = mconcreteFactoryAF1.createProduct2("concreteFactoryAF1_concreteProductAF2_ID:0x021",2.5f);
		mProduct1.show();
		mProduct2.show();
		mProduct1 = mconcreteFactoryAF2.createProduct1("concreteFactoryAF2_concreteProductAF1_ID:0x012",1.8f);
		mProduct2 = mconcreteFactoryAF2.createProduct2("concreteFactoryAF2_concreteProductAF2_ID:0x022",2.3f);
		mProduct1.show();
		mProduct2.show();		
	}
}
