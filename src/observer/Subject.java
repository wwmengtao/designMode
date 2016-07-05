package observer;

//观察者模式中的内容提供者接口
public interface Subject {
	public void registerObserver(ObserverSelf obj);
	public void unRegisterObserver(ObserverSelf obj);	
	public void notifyObservers();
}
