package com.mt.designmode.strategy;

import com.mt.designmode.tools.ALog;

public class MuteQuack implements Quackhaviour{

	@Override
	public void Quack() {
		// TODO Auto-generated method stub
		ALog.Log("Silent");
	}

}
