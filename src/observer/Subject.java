package observer;

//�۲���ģʽ�е������ṩ�߽ӿ�
public interface Subject {
	public void registerObserver(ObserverSelf obj);
	public void unRegisterObserver(ObserverSelf obj);	
	public void notifyObservers();
}
