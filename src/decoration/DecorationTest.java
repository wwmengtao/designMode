package decoration;

import designmode.tools.ALog;

public class DecorationTest {
	public static void main(String []args){
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
