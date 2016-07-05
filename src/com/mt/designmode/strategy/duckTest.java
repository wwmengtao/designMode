package com.mt.designmode.strategy;

public class duckTest {
	public static void main(String []args){
		GreenDuck mGreenDuck = new GreenDuck();
		mGreenDuck.display();
		mGreenDuck.performFly();
		mGreenDuck.performQuack();
	}
}
