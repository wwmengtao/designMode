package observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
	private ArrayList<ObserverSelf> mObservers;
	private float temp;
	private float humidity;
	private float pressure;
	
	public WeatherData(){
		mObservers = new ArrayList<ObserverSelf>();
	}
	
	@Override
	public void registerObserver(ObserverSelf obj) {
		// TODO Auto-generated method stub
		mObservers.add(obj);
	}

	@Override
	public void unRegisterObserver(ObserverSelf obj) {
		// TODO Auto-generated method stub
		if(null!=mObservers&&mObservers.size()>0){
			mObservers.remove(obj);
		}
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for(ObserverSelf obj : mObservers){
			obj.update(temp, humidity, pressure);
		}
	}

	public void measurementsChanged(){
		notifyObservers();
	}
	
	public void setMeasurements(float temp, float humidity, float pressure){
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
