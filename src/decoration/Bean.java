package decoration;

public class Bean extends CondimentDecorator{
	Beverage mBeverage;
	
	public Bean(Beverage mBeverage){
		this.mBeverage=mBeverage;
	}
	
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return mBeverage.getDescription()+", Bean";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return mBeverage.cost()+0.1;
	}

}
