package decoration;

public class Mocha extends CondimentDecorator{
	Beverage mBeverage;
	
	public Mocha(Beverage mBeverage){
		this.mBeverage=mBeverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return mBeverage.getDescription()+", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return mBeverage.cost()+0.2;
	}

}
