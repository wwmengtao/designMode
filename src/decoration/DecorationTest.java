package decoration;

import designmode.tools.ALog;

public class DecorationTest {
	
	abstract class CondimentDecorator extends Beverage{
		public abstract String getDescription();
	}
	
	class Mocha extends CondimentDecorator{
		Beverage mBeverage;
		public Mocha(Beverage mBeverage){
			this.mBeverage=mBeverage;
		}
		public String getDescription() {
			return mBeverage.getDescription()+", Mocha";
		}
		public double cost() {
			return mBeverage.cost()+0.2;
		}

	}
	
	class Bean extends CondimentDecorator{
		Beverage mBeverage;
		public Bean(Beverage mBeverage){
			this.mBeverage=mBeverage;
		}

		public String getDescription() {
			return mBeverage.getDescription()+", Bean";
		}

		public double cost() {
			return mBeverage.cost()+0.1;
		}
	}
	
	abstract class Beverage {
		String description="Unknown Beverage";
		public String getDescription(){
			return description;
		}
		public abstract double cost();
	}
	
	class Espresso extends Beverage{
		public Espresso(){
			description="Espresso";
		}
		public double cost() {
			return 1.99;
		}
	}
	class HouseBlend extends Beverage{
		public HouseBlend(){
			description="HouseBlend";
		}
		public double cost() {
			return 0.89;
		}
	}
	
	public static void main(String []args){
		new DecorationTest();
	}
	
	public DecorationTest(){
		Beverage mBeverage=new Espresso();
		ALog.Log(mBeverage.getDescription()+" $"+mBeverage.cost());
		Beverage mBeverage2=new Espresso();
		mBeverage2=new Mocha(mBeverage2);
		mBeverage2=new Mocha(mBeverage2);
		ALog.Log(mBeverage2.getDescription()+" $"+mBeverage2.cost());
		Beverage mBeverage3=new HouseBlend();
		mBeverage3=new Bean(mBeverage3);
		mBeverage3=new Mocha(mBeverage3);
		ALog.Log(mBeverage3.getDescription()+" $"+mBeverage3.cost());
	}
}
