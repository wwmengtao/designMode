package factory;

public class PizzaStore {
	SimplePizzaFactory mSimplePizzaFactory=null;
	
	public PizzaStore(SimplePizzaFactory mSimplePizzaFactory){
		this.mSimplePizzaFactory = mSimplePizzaFactory;
	}
	
	public Pizza orderPizza(String type){
		Pizza mPizza = mSimplePizzaFactory.CreatePizza(type);
		mPizza.prepare();
		mPizza.bake();
		mPizza.cut();
		mPizza.box();
		return mPizza;
	}

}
