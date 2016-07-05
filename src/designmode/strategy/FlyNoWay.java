package designmode.strategy;

import designmode.tools.ALog;

public class FlyNoWay implements FlyBehaviour{

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		ALog.Log("Can't fly");
	}

}
