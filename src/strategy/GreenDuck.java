package strategy;

import designmode.tools.ALog;

public class GreenDuck extends duck{
	public GreenDuck(){
		mFlyBehaviour= new FlyWithWings();
		mQuackhaviour = new Quack();
	}
	
	public void display(){
		ALog.Log("A GreenDuck");
	}

}
