package factory;

public class FactoryTest {
	
	public static void main(String []args){
		SimplePizzaFactory mSimplePizzaFactory=new SimplePizzaFactory();
		(new PizzaStore(mSimplePizzaFactory)).orderPizza("Cheese");
	}
}
