package factory;

public class SimplePizzaFactory {
	Pizza mPizza=null;
	public Pizza CreatePizza(String type){
		if(null==type)return null;
		switch(type){
		case "Cheese":
			mPizza= new CheesePizza();
			break;
		case "Clam":
			mPizza= new ClamPizza();
			break;			
		}
		return mPizza;
	}
}
